package com.kurinchi;

public class Main {

    public static void main(String[] args) {

        Country country = CountryFactory.getCountry(City.SEATLLE);

        System.out.println(country.getName());

        //System.out.println(new India().getName());
    }
}
