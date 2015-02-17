package structural.decorator.pizza;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza pizza) {
        super(pizza);
        System.out.println("Adding sauce");
    }

    public String getDescription() {
        return p.getDescription() + ", tomato sauce";
    }

    public double getCost() {
        return p.getCost() + 0.35;
    }

}