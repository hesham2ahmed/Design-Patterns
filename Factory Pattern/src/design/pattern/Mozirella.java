package design.pattern;

public class Mozirella extends Topping{
    public Mozirella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding MOZ");
    }
    public String getDesc(){
        return super.getDesc() + ", Mozzarella";
    }
    public double getCost(){
        return super.getCost() + 0.50;
    }
}
