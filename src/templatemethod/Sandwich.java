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
            if (afterFirstCustomer) {
                System.out.println("\n");
            }
            
            addCheese();
            
            afterFirstCondiment = true;
        }
        
        if (customerWantsVegetables()) {
            if (afterFirstCondiment) {
                System.out.println("\n");
            }
            
            addVegetables();
            
            afterFirstCondiment = true;
        }
        
        if (customerWantsCondiments()) {
            if (afterFirstCondiment) {
                System.out.println("\n");
            }
            
            addCondiments();
            
            afterFirstCondiment = true;
        }
        
        wrapSandwich();
    }
    
}