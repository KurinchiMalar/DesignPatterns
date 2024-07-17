package corePatterns.creational.singleton;

import java.io.Serializable;

public class LoggerSingleton implements Serializable,Cloneable {

    private static volatile LoggerSingleton instance;

    private LoggerSingleton(){}
    protected static LoggerSingleton getInstance(){
        if(instance ==  null){
            synchronized (LoggerSingleton.class){
                if(instance == null){
                    instance = new LoggerSingleton();
                }
            }
        }

        return instance;
    }

    // deserialization handling
    public Object readResolve(){
        return instance;
    }

    //To avoid Cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    public void log(String message){
        System.out.println("Log Message : "+message);
    }
}
