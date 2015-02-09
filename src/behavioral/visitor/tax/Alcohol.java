package behavioral.visitor.tax;

public class Alcohol implements Visitable {
    
    private double price;
    
    Alcohol(double item) {
        price = item;
    }
    
    public double accept(Visitor v) {
        return v.visit(this);
    }
    
    public double getPrice() {
        return price;
    }
    
}