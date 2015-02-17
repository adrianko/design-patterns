package structural.decorator.pizza;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);
        System.out.println("Adding moz");
    }

    public String getDescription() {
        return p.getDescription() + ", mozzarella";
    }

    public double getCost() {
        return p.getCost() + 0.5;
    }

}