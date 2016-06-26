package com.kurinchi;

/**
 * Created by kurinchimalar on 25/6/16.
 */

public class CountryFactory {

    public static Country getCountry(City city){

        Country instance = null;
        switch (city){

            case CHENNAI :
            case BANGALORE:
            case HYDERABAD:
                instance = new India();
                break;
            case SEATLLE:
            case FLORIDA:
                instance = new USA();
                break;
        }
        return instance;
    }
}
