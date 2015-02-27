package behavioral.iterator.songs;

public class Radio {

    /**
     * Iterator - allows access to objects that are stored in different types of collections. Done
     * through the use of a common interface which provides an iterator.
     * @param args
     */
    public static void main(String[] args) {
        DJ ak = new DJ(new SongsOfThe70s(), new SongsOfThe80s(), new SongsOfThe90s());
        ak.showTheSongs();
    }
    
}