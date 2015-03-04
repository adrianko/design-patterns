package structural.proxy.atm;

public class Customer {

    /**
     * Proxy - limits access to just the methods made accessible in another class.
     * @param args
     */
    public static void main(String[] args) {
        GetATMData realATMMachine = new ATMMachine();
        GetATMData atmProxy = new ATMProxy();
        System.out.println("\nCurrent ATM State " + atmProxy.getATMState());
        System.out.println("\nCash in ATM Machine $" + atmProxy.getCashInMachine());
    }
    
}