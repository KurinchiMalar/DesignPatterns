package corePatterns.SOLIDPrinciples.SingleResponsibilityPrinciple.BEFORE;

public class Marker {
    String name;
    String color;
    int year;
    public int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}
