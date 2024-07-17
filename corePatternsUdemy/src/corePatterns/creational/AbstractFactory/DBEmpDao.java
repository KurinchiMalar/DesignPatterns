package corePatterns.creational.AbstractFactory;

public class DBEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Employee to DB");
    }
}
