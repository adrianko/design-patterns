package behavioral.state.atm;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }
}