package facade;

public class CheckAccountNumber {
    
    private int acc = 12345678;
    
    public int getAccountNumber() {
        return acc;
    }
    
    public boolean accountActive(int accNum) {
        if(acc == accNum) {
            return true;
        }
        
        return false;
    }
    
}