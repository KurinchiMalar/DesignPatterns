package corePatterns.SOLIDPrinciples.OpenClosedPrinciple.a_BEFORE;

import corePatterns.SOLIDPrinciples.SingleResponsibilityPrinciple.AFTER.Invoice;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        // save into DB
    }

    /*
    New modification ;(
     */
    public void saveToFile(){
        // save into DB
    }
}
