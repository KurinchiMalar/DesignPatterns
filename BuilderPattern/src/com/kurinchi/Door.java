package com.kurinchi;

import java.util.stream.Stream;

/**
 * Created by kurinchimalar on 25/6/16.
 */
public class Door {

    private WoodType woodType;

    public static enum WoodType{
        TEAK,
        ROSEWOOD;
    }

    public Door(WoodType woodType){
        this.woodType = woodType;
    }

    @Override
    public String toString() {
        return "Door{" +
                "woodType=" + woodType +
                '}';
    }
}
