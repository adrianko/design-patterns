package behavioral.state.atm;

public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }
}