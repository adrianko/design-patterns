package structural.adapter.mediaplayer;

public class MediaAdapter implements MediaPlayer {
    
    AdvancedMediaPlayer amp;
    
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            
        } else if (audioType.equalsIgnoreCase("mp4")) {
            
        }
    }
    
}