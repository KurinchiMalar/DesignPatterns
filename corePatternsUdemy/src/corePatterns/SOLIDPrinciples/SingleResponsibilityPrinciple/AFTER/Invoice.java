package corePatterns.SOLIDPrinciples.SingleResponsibilityPrinciple.AFTER;

import corePatterns.SOLIDPrinciples.SingleResponsibilityPrinciple.BEFORE.Marker;

public class Invoice {
    private corePatterns.SOLIDPrinciples.SingleResponsibilityPrinciple.BEFORE.Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = (marker.price)*this.quantity;
        return price;
    }
}
