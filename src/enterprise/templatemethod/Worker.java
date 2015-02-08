package enterprise.templatemethod;

public class Worker {
    
    public static void main(String[] args) {
        ItalianSandwich customer12 = new ItalianSandwich();
        customer12.makeSandwich();
        System.out.println();
        
        VeggieSandwich customer15 = new VeggieSandwich();
        customer15.makeSandwich();
    }
    
}