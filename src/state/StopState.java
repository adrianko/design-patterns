package state;

public class StopState implements State {

    @Override
    public void doAction(Context c) {
        System.out.println("Player is in stop state");
        c.setState(this);
    }

    @Override
    public String toString() {
        return "Start state";
    }

}
