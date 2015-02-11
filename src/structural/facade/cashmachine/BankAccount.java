package structural.facade.cashmachine;

public class BankAccount {
    
    private int acc;
    private int pin;
    
    CheckAccountNumber can;
    CheckPIN cp;
    CheckFunds cf;
    
    Welcome w;
    
    public BankAccount(int an, int p) {
        acc = an;
        pin = p;
        
        w = new Welcome();
        
        can = new CheckAccountNumber();
        cp = new CheckPIN();
        cf = new CheckFunds();
    }
    
    public void withdrawCash(double cash) {
        if (can.accountActive(acc) && cp.match(pin) && cf.enough(cash)) {
            System.out.println("Transaction complete.");
        } else {
            System.out.println("Transaction failed.");
        }
    }
    
    public void depositCash(double cash) {
        if (can.accountActive(acc) && cp.match(pin)) {
            cf.makeDeposit(cash);
            System.out.println("Transaction complete.");
        } else {
            System.out.println("Transaction failed.");
        }
    }
    
}