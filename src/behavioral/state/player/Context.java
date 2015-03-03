package behavioral.state.player;

public class Context {

    private State state;

    public void setState(State s) {
        state = s;
    }

    public State getState() {
        return state;
    }

}