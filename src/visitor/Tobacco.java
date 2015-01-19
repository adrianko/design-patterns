package visitor;

public class Tobacco implements Visitable {

    private double price;

    Tobacco(double item) {
        price = item;
    }

    public double accept(Visitor v) {
        return v.visit(this);
    }

    public double getPrice() {
        return price;
    }

}