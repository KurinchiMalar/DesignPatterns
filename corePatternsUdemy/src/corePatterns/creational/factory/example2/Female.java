package corePatterns.creational.factory.example2;

public class Female implements Person{
    @Override
    public void wish(String msg) {
        System.out.println("Wishing from Female: "+msg );
    }
}
