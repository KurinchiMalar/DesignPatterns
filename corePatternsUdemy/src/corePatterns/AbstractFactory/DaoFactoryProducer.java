package corePatterns.AbstractFactory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String factoryType){
        DaoAbstractFactory daf = null;

        if(factoryType.equals("xml")){
            return  new XMLDaoFactory();
        }else if(factoryType.equals("db")){
            return new DBDaoFactory();
        }
        return daf;
    }
}
