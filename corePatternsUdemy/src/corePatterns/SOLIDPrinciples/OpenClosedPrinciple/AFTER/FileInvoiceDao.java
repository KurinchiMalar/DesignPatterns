package corePatterns.SOLIDPrinciples.OpenClosedPrinciple.AFTER;

public class FileInvoiceDao implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        // save to File
    }
}
