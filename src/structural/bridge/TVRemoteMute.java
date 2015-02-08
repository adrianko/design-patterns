package structural.bridge;

public class TVRemoteMute extends RemoteButton {

    public TVRemoteMute(EntertainmentDevice e) {
        super(e);
    }
    
    public void buttonNinePressed() {
        System.out.println("TV was muted");
    }

}