package templatemethod;

public class ItalianSandwich extends Sandwich {
    
    String[] meatUsed = { "Salami", "Pepperoni", "Ham" };
    String[] cheeseUsed = { "Provolone" };
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };
    
    @Override
    void addMeat() {
        addComponents("meat", meatUsed);
    }

    @Override
    void addCheese() {
        addComponents("cheese", cheeseUsed);
    }

    @Override
    void addVegetables() {
        addComponents("vegetables", veggiesUsed);
    }

    @Override
    void addCondiments() {
        addComponents("condiments", condimentsUsed);
    }
    
    void addComponents(String comp, String[] comps) {
        System.out.print("Adding " + comp + ": ");
        
        for (String c : comps) {
            System.out.print(c + " ");
        }
    }
    
}