package design.pattern;

public class PizzaFactory {
    public Pizza createPizza(String type){
        if(type.equals("PlainPizza"))
            return createPlainPiza();
        else if (type.equals("MozirellaPizza"))
            return createMozirellaPizza();
        else
            return createDoubleMozirellaPizza();
    }

    private Pizza createPlainPiza(){
        return new PlainPizza();
    }

    private Pizza createMozirellaPizza(){
        Pizza pizza = new PlainPizza();
        return new Mozirella(pizza);
    }

    private Pizza createDoubleMozirellaPizza(){
        Pizza pizza = new PlainPizza();
        pizza = new Mozirella(pizza);
        pizza = new Mozirella(pizza);
        return pizza;
    }
}
