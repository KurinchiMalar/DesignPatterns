package com.kurinchi;

/**
 * Created by kurinchimalar on 25/6/16.
 House

 Requirements:
 Door
 Single/Double
 WoodType - Teak/Sandal

 Floor - Mosaic/Tile

 Ceiling - Plain/Dec

 Walls - Plain /Dec
*/
public class House {

    private Door door;
    private Floor floor;
    private Ceiling ceiling;

    private House(Door door, Floor floor, Ceiling ceiling){

        this.door = door;
        this.floor = floor;
        this.ceiling = ceiling;

    }

    @Override
    public String toString() {
        return "House {" +
                "door=" + door +
                ", floor=" + floor +
                ", ceiling=" + ceiling +
                '}';
    }

    public static class Builder {

        private Door door;
        private Floor floor;
        private Ceiling ceiling;

        public Builder(Door door, Floor floor, Ceiling ceiling){

            this.door = door;
            this.floor = floor;
            this.ceiling = ceiling;
        }

        public House buildHouse(){
            return new House(door,floor,ceiling);
        }
    }


}
