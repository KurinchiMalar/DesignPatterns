package corePatterns.creational.factory;

public class PizzaFactory {

    public static Pizza createPizza(String type){
        Pizza p = null;
        if(type.equals("cheese")){
            p = new CheezePizza();
        }else if(type.equals("chicken")){
            p = new ChickenPizza();
        }else if(type.equals("veggie")){
            p = new VeggiePizza();
        }else{
            p = new PlainPizza();
        }
        return p;
    }
}
