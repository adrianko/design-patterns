package structural.adapter.mediaplayer;

public class Player {
    
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        
        ap.play("mp3", "Secrets.mp3");
    }
    
}