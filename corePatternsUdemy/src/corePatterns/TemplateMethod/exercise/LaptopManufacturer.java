package corePatterns.TemplateMethod.exercise;

public class LaptopManufacturer extends ComputerManufacturer{
    @Override
    public void addHardDisk() {
        System.out.println("Adding Laptop HardDisk");
    }

    @Override
    public void addRAM() {
        System.out.println("Adding Laptop RAM");
    }

    @Override
    public void addKeyBoard() {
        System.out.println("Adding Laptop Keyboard");
    }
}
