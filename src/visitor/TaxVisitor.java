package visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {
    
    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public double visit(Alcohol alcoholicItem) {
        System.out.println("Alcoholic Item: Price with VAT");
        
        return Double.parseDouble(df.format((alcoholicItem.getPrice() * .18) + alcoholicItem.getPrice()));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Alcoholic Item: Price with VAT");
        
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .2) + tobaccoItem.getPrice()));
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Alcoholic Item: Price with VAT");
        
        return Double.parseDouble(df.format(necessityItem.getPrice()));
    }
    
}