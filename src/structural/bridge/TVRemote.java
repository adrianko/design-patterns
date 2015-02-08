package structural.bridge;

public class TVRemote {

    /**
     * Build a group of classes that slowly add functionality from one class to 
     * next.
     * @param args
     */
    public static void main(String[] args) {
        RemoteButton tvMute = new TVRemoteMute(new TVDevice(1, 200));
        RemoteButton tvPause = new TVRemotePause(new TVDevice(1, 200));

        System.out.println("Test TV with Mute");
        tvMute.buttonFivePressed();
        tvMute.buttonSixPressed();
        tvMute.buttonNinePressed();

        System.out.println("\nTest TV with Pause");
        tvPause.buttonFivePressed();
        tvPause.buttonSixPressed();
        tvPause.buttonNinePressed();
        tvPause.deviceFeedback();
    }
    
}