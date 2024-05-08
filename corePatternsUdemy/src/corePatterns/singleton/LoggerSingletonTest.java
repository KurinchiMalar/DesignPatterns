package corePatterns.singleton;

public class LoggerSingletonTest {
    public static void main(String[] args) {
        LoggerSingleton instance1 = LoggerSingleton.getInstance();
        LoggerSingleton instance2 = LoggerSingleton.getInstance();
        System.out.println(instance1 == instance2);
        instance1.log("Hello");
        instance2.log("how are you");
    }
}
