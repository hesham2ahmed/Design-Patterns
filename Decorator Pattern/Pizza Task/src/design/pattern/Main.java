package design.pattern;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Mozirella(new PlainPizza());
        System.out.println("DESC: " + pizza.getDesc());
        System.out.println("COST: " + pizza.getCost());
    }
}
