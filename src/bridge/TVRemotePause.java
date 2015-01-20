package bridge;

public class TVRemotePause extends RemoteButton {
    
    public TVRemotePause(EntertainmentDevice e) {
        super(e);
    }
    
    public void buttonNinePressed() {
        System.out.println("TV was paused");
    }

}