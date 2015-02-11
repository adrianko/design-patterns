package structural.facade.cashmachine;

public class CheckFunds {
    
    private double balance = 1000.00;
    
    public double getBalance() {
        return balance;
    }
    
    public void withdraw(double cash) {
        balance -= cash;
    }
    
    public void deposit(double cash) {
        balance += cash;
    }
 
    public boolean enough(double w) {
        if (w > balance) {
            System.out.println("Not enough");
            
            return false;
        }
        
        withdraw(w);
        System.out.println("Withdrawal complete");
        
        return true;
    }
    
    public boolean makeDeposit(double d) {
        deposit(d);
        System.out.println("Deposited");
        
        return true;
    }
     
}