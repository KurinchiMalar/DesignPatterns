package corePatterns.creational.factory.example2;

public class Client {
    public static void main(String[] args) {
        Person p = PersonFactory.createPerson("Male");
        p.wish("Hello");
    }
}
