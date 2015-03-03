package behavioral.state.atm;

public class Customer {
    
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine();
        atm.insertCard();
        atm.ejectCard();
        atm.insertCard();
        atm.insertPin(1234);
        atm.requestCash(2000);
        atm.insertCard();
        atm.insertPin(1234);
    }
    
}