package creational.builder.fastfood;

public class Combos {

    public Meal prepareVegMeal() {
        Meal m = new Meal();
        m.addItem(new VegBurger());
        m.addItem(new Coke());
        
        return m;
    }
    
    public Meal prepareNonVegMeal() {
        Meal m = new Meal();
        m.addItem(new ChickenBurger());
        m.addItem(new Fanta());
        
        return m;
    }
    
}