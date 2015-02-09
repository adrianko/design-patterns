package behavioral.visitor.tax;

public interface Visitable {
    
    public double accept(Visitor v);
    
}