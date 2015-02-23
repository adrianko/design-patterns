package structural.adapter.mediaplayer;

public class Player {
    
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        
        ap.play("mp3", "Secrets.mp3");
        ap.play("mp4", "TV Show.mp4");
        ap.play("vlc", "Film.vlc");
    }
    
}