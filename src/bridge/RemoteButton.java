package bridge;

public abstract class RemoteButton {

    private EntertainmentDevice ed;

    public RemoteButton(EntertainmentDevice e) {
        ed = e;
    }
    
    public void buttonFivePressed() {
        ed.buttonFivePressed();
    }
    
    public void buttonSixPressed() {
        ed.buttonSixPressed();
    }

}