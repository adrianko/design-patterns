package facade;

public class CheckPIN {
    
    private int pin = 1234;
    
    public int getPIN() {
        return pin;
    }
    
    public boolean match(int p) {
        if(pin == p) {
            return true;
        }
        
        return false;
    }
    
}