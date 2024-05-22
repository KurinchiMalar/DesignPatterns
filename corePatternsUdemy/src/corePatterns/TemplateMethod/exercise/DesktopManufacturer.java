package corePatterns.TemplateMethod.exercise;

public class DesktopManufacturer extends ComputerManufacturer{
    @Override
    public void addHardDisk() {
        System.out.println("Adding Desktop HardDisk");
    }

    @Override
    public void addRAM() {
        System.out.println("Adding Desktop RAM");
    }

    @Override
    public void addKeyBoard() {
        System.out.println("Adding Desktop Keyboard");
    }
}
