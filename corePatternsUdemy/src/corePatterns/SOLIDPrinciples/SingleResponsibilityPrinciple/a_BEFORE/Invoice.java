package corePatterns.SOLIDPrinciples.SingleResponsibilityPrinciple.a_BEFORE;

public class Invoice {
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = (marker.price)*this.quantity;
        return price;
    }
    public void printInvoice(){
        // print the invoice
    }
    public void saveToDB(){
        // save contents to db
    }
}

/*
There could be more than one reason to change here.

1) calculateTotal implementation can change to include GST fees etc
2) Printing method can change, formatting etc
3) saveToDB could have another implementation to saveToFile


More than one reason to change and hence doesn't fall under SingleResponsibility Principle.
 */