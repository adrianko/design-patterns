package state;

public class CheckPlayerState {

    /**
     * State - class behaviour changes based on its state. Different objects
     * represent different states and a context object whose behaviour varies
     * as its state object changes.
     * @param args
     */
    public static void main(String[] args) {
        Context c = new Context();

        StartState start = new StartState();
        start.doAction(c);
        System.out.println(c.getState().toString());

        StopState stop = new StopState();
        stop.doAction(c);
        System.out.println(c.getState().toString());
    }

}