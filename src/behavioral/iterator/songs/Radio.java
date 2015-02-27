package behavioral.iterator.songs;

public class Radio {
    
    public static void main(String[] args) {
        DJ ak = new DJ(new SongsOfThe70s(), new SongsOfThe80s(), new SongsOfThe90s());
        ak.showTheSongs();
    }
    
}