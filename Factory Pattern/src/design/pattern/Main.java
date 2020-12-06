package design.pattern;

public class Main {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new PizzaFactory());
        System.out.println("Desc: " + store.orderPizza("MozirellaPizza").getDesc());
        System.out.println("Desc: " + store.orderPizza("DoubleMoozirellaPizza").getDesc());
    }
}
