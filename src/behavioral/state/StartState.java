package behavioral.state;

public class StartState implements State {

    @Override
    public void doAction(Context c) {
        System.out.println("Player is in start behavioral.state");
        c.setState(this);
    }

    @Override
    public String toString() {
        return "Start behavioral.state";
    }

}