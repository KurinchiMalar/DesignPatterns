package corePatterns.singleton;

public class EnumSingleTonTest_ReflectionProbSolution {
    public static void main(String[] args) {
        EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("KurinchiMalar");
        System.out.println(instance.getName());
    }
}
