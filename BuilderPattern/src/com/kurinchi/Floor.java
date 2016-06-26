package com.kurinchi;

/**
 * Created by kurinchimalar on 25/6/16.
 */
public class Floor {

    private FloorType floorType;
    public enum FloorType{
        PLAIN,
        DECORATED
    }
    public Floor(FloorType floorType){

        this.floorType = floorType;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "floorType=" + floorType +
                '}';
    }
}
