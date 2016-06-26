package com.kurinchi;

/**
 * Created by kurinchimalar on 25/6/16.
 */
public class Ceiling {

    private CeilingType ceilingType;

    public enum CeilingType{
        PLAIN,
        DECORATED
    }

    public Ceiling(CeilingType ceilingType){
        this.ceilingType = ceilingType;
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "ceilingType=" + ceilingType +
                '}';
    }
}
