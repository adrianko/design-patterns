package structural.adapter.mediaplayer;

public class MediaAdapter implements MediaPlayer {
    
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            
        } else if (audioType.equalsIgnoreCase("mp4")) {
            
        }
    }
    
}