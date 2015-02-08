package structural.decorator;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza p;

    public ToppingDecorator(Pizza pizza) {
        p = pizza;
    }

    public String getDescription() {
        return p.getDescription();
    }

    public double getCost() {
        return p.getCost();
    }

}