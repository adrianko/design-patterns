package state;

public class CheckPlayerState {

    public static void main(String[] args) {
        Context c = new Context();

        StartState start = new StartState();
        start.doAction(context);
        System.out.println(c.getState().toString());
    }

}