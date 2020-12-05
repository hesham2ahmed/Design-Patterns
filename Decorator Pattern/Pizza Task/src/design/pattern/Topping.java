package design.pattern;

public abstract class Topping implements Pizza {
    protected Pizza pizza;
    public Topping(Pizza newPizza){
        this.pizza = newPizza;
    }
    public String getDesc(){
        return pizza.getDesc();
    }
    public double getCost(){
        return pizza.getCost();
    }
}
