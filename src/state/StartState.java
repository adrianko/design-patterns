package state;

public class StartState implements State {

    @Override
    public void doAction(Context c) {
        System.out.println("Player is in stop state");
        c.setState(this);
    }

    public String toString() {
        return "Stop state";
    }
    
}