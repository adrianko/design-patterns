package behavioral.state.atm;

public class Customer {

    /**
     * State - used to encapsulate varying behaviour for the same routine based on an object's state object.
     * Is a cleaner way for an object to change its behaviour at runtime without resorting to large monolithic
     * conditional statements.
     * @param args
     */
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