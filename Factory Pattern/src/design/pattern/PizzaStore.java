package design.pattern;

public class PizzaStore {
    PizzaFactory pizzaFactory;
    public PizzaStore(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }
    public Pizza orderPizza(String type){
       return pizzaFactory.createPizza(type);
    }
}
