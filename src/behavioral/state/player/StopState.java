package behavioral.state.player;

public class StopState implements State {

    @Override
    public void doAction(Context c) {
        System.out.println("Player is in stop behavioral.state");
        c.setState(this);
    }

    @Override
    public String toString() {
        return "Start behavioral.state";
    }

}
