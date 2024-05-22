package corePatterns.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        DaoAbstractFactory daf1 = DaoFactoryProducer.produce("db"); // Factory of Factores
        Dao dao1 = daf1.createDao("emp");
        dao1.save();

        DaoAbstractFactory daf2 = DaoFactoryProducer.produce("db");
        Dao dao2 = daf2.createDao("dept");
        dao2.save();

        DaoAbstractFactory daf3 = DaoFactoryProducer.produce("db");
        Dao dao3 = daf3.createDao("emp");
        dao3.save();

        DaoAbstractFactory daf4 = DaoFactoryProducer.produce("db");
        Dao dao4 = daf4.createDao("dept");
        dao4.save();

        DaoAbstractFactory daf5 = DaoFactoryProducer.produce("xml");
        Dao dao5 = daf5.createDao("dept");
        dao5.save();

    }
}
