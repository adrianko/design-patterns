package behavioral.visitor.tax;

public interface Visitor {
    
    public double visit(Alcohol alcoholicItem);
    public double visit(Tobacco tobaccoItem);
    public double visit(Necessity necessityItem);
    
}