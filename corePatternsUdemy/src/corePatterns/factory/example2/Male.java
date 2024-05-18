package corePatterns.factory.example2;

public class Male implements Person{
    @Override
    public void wish(String msg) {
        System.out.println("Wishing from Male: "+msg);
    }
}
