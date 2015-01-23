package templatemethod;

public abstract class Sandwich {
    
    boolean afterFirstCondiment = false;
    
    final void makeSandwich() {
        cutBun();

        if (customerWantsMeat()) {
            addMeat();
            
            afterFirstCondiment = true;
        }

        if (customerWantsCheese()) {
            afterFirstCondiment();
            addCheese();
            
            afterFirstCondiment = true;
        }
        
        if (customerWantsVegetables()) {
            afterFirstCondiment();
            addVegetables();
            
            afterFirstCondiment = true;
        }
        
        if (customerWantsCondiments()) {
            afterFirstCondiment();
            addCondiments();
            
            afterFirstCondiment = true;
        }
        
        wrapSandwich();
    }
    
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();
    
    public void cutBun() {
        System.out.println("The sandwich is cut");
    }
    
    boolean customerWantsMeat() {
        return true;
    }
    
    boolean customerWantsCheese() {
        return true;
    }
    
    boolean customerWantsVegetables() {
        return true;
    }
    
    boolean customerWantsCondiments() {
        return true;
    }
    
    public void wrapSandwich() {
        System.out.println("Wrap sandwich");
    }
    
    public void afterFirstCondiment() {
        if (afterFirstCondiment) {
            System.out.print("\n");
        }
    }

    void addComponents(String comp, String[] comps) {
        System.out.print("Adding " + comp + ": ");

        for (String c : comps) {
            System.out.print(c + " ");
        }
    }
    
}