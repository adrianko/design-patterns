package structural.proxy.atm;

public class ATMProxy implements GetATMData {
    
    @Override
    public ATMState getATMState() {
        return new ATMMachine().getATMState();
    }

    @Override
    public int getCashInMachine() {
        return new ATMMachine().getCashInMachine();
    }
    
}
