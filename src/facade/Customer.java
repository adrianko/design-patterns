package facade;

public class Customer {

    /**
     * Facade - simplify methods so that much of what is done is in the background.
     * Decouple client from sub components needed to perform an operation.
     * A simplified interface that performs many other actions behind the scenes.
     * @param args
     */
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(12345678, 1234);
        
        ba.withdrawCash(100.00);
        ba.depositCash(100.00);
        ba.withdrawCash(1000.01);
    }
    
}