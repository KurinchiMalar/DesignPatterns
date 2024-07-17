package corePatterns.creational.singleton;

/*
benefit of Enum, there are no constructors therefore no access exposed to the instance.
The only way to access the instance is through the Enum itself
- Reflection Problem mitigated

 */
public enum EnumSingletonDemo {
    INSTANCE;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
