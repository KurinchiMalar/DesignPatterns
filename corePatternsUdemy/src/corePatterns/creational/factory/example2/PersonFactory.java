package corePatterns.creational.factory.example2;

public class PersonFactory {
    public static Person createPerson(String gender){
        Person p = null;
        if(gender.equals("Male")){
            p = new Male();
        }else{
            p = new Female();
        }
        return p;
    }
}
