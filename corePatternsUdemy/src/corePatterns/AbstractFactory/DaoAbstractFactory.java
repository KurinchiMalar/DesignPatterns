package corePatterns.AbstractFactory;

public abstract class DaoAbstractFactory {
    public abstract  Dao createDao(String type);
}
