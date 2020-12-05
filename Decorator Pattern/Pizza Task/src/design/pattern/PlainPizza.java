package design.pattern;

public class PlainPizza implements Pizza {

    @Override
    public String getDesc() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
