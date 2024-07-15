package corePatterns.SOLIDPrinciples.OpenClosedPrinciple.AFTER;

public class DbInvoiceDao implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        // save to Db
    }
}
