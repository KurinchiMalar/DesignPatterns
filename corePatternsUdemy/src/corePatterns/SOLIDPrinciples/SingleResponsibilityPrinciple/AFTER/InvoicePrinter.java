package corePatterns.SOLIDPrinciples.SingleResponsibilityPrinciple.AFTER;

public class InvoicePrinter {
    private Invoice invoice;

    InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void printInvoice(){
        // print the invoice
    }
}
