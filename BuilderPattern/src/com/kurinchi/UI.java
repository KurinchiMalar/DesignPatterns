package com.kurinchi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kurinchimalar on 25/6/16.
 */
public class UI {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Select the door type " + Arrays.asList(Door.WoodType.values()) + " :");
        Door door = new Door(Door.WoodType.valueOf( in.next() ));
        System.out.println("Select the floor type " + Arrays.asList(Floor.FloorType.values()) + " :");
        Floor floor = new Floor(Floor.FloorType.valueOf( in.next() ));
        System.out.println("Select the floor type " + Arrays.asList(Ceiling.CeilingType.values()) + " :");
        Ceiling ceiling = new Ceiling(Ceiling.CeilingType.valueOf( in.next() ));

        House.Builder housebuilder = new House.Builder(door,floor,ceiling);
        House house = housebuilder.buildHouse();
        System.out.println(house.toString());


    }

}
