package templatemethod;

public class VeggieSandwich extends Sandwich {
    
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };
    
    boolean customerWantsMeat() {
        return false;
    }
    
    boolean customerWantsCheese() {
        return false;
    }
    
    @Override
    void addMeat() {}

    @Override
    void addCheese() {}

    @Override
    void addVegetables() {

    }

    @Override
    void addCondiments() {

    }
}
