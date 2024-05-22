package corePatterns.TemplateMethod.exercise;

public class Test {
    public static void main(String[] args) {
        ComputerManufacturer manufacturer = new LaptopManufacturer();
        manufacturer.buildComputer();

        ComputerManufacturer manufacturer1 = new DesktopManufacturer();
        manufacturer1.buildComputer();
    }
}
