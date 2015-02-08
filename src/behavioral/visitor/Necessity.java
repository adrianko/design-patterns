package behavioral.visitor;

public class Necessity implements Visitable {

    private double price;

    Necessity(double item) {
        price = item;
    }

    public double accept(Visitor v) {
        return v.visit(this);
    }

    public double getPrice() {
        return price;
    }

}