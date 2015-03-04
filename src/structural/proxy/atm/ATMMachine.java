package structural.proxy.atm;

public class ATMMachine implements GetATMData {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;
    
    @Override
    public ATMState getATMState() {
        return null;
    }

    @Override
    public int getCashInMachine() {
        return 0;
    }
    
}
