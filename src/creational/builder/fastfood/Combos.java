package creational.builder.fastfood;

public class Combos {

    public Meal prepareVegMeal() {
        Meal m = new Meal();
        m.addItem(new VegBurger());
        m.addItem(new Coke());
        
        return m;
    }
    
}