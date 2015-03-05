package behavioral.command.electronics;

public class Television {

    private int volume = 0;
    
    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void volumeUp() {
        volume++;
        System.out.println("TV Volume is at: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("TV Volume is at: " + volume);
    }

}