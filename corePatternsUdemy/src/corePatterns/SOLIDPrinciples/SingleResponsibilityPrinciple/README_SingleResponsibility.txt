A class should have only one reason to change.


BEFORE/Invoice.java :

    /*
    There could be more than one reason to change here.

    1) calculateTotal implementation can change to include GST fees etc
    2) Printing method can change, formatting etc
    3) saveToDB could have another implementation to saveToFile


    More than one reason to change and hence doesn't fall under SingleResponsibility Principle.
     */


AFTER/Invoice.java

    The changing methods Print and savetoDB are isolated to different classes
    InvoicePrinter.java
    InvoiceDao.java