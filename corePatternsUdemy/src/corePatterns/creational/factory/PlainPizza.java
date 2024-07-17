package corePatterns.creational.factory;

public class PlainPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Plain Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Plain Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Plain Pizza");
    }
}
