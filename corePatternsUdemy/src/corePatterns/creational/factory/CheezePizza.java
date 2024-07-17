package corePatterns.creational.factory;

public class CheezePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Cheeze Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheeze Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheeze Pizza");
    }
}
