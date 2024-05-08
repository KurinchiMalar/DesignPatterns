package corePatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

    public static void main(String[] args) {
        DateUtilLazyInit instance1 = DateUtilLazyInit.getInstance();
        DateUtilLazyInit instance2 = null;

        Constructor[] constructors = DateUtilLazyInit.class.getDeclaredConstructors();
        for(Constructor constructor: constructors){
            constructor.setAccessible(true); // By default this is false
            try {
                instance2 = (DateUtilLazyInit) constructor.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(instance1==instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
