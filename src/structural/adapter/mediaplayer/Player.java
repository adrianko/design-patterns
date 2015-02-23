package structural.adapter.mediaplayer;

public class Player {

    /**
     * Adapter - works as a bridge between two incompatible interfaces. Involves a single class which is responsible for
     * joining the functionalities of independent or incompatible interfaces.
     * @param args
     */
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        
        ap.play("mp3", "Secrets.mp3");
        ap.play("mp4", "TV Show.mp4");
        ap.play("vlc", "Film.vlc");
        ap.play("avi", "video.avi");
    }
    
}