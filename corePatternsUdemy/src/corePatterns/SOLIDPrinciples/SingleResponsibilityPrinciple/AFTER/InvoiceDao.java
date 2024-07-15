package corePatterns.SOLIDPrinciples.SingleResponsibilityPrinciple.AFTER;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        // save into DB
    }
}
