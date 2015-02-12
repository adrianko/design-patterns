package structural.composite.radio;

public class Playlist {

    /**
     * Composite - allows objects and compositions of objects to be treated uniformly
     * @param args
     */
    public static void main(String[] args) {
        SongComponent pop = new SongGroup("Pop", "Popular music");
        SongComponent popRock = new SongGroup("Pop Rock", "Pop Rock music");
        SongComponent rock = new SongGroup("Rock", "Rock music");
        
        SongComponent allSongs = new SongGroup("Song List", "All");
        allSongs.add(pop);
        pop.add(new Song("Blank Space", "Taylor Swift", 2014));
        
        pop.add(popRock);
        popRock.add(new Song("Sugar", "Maroon 5", 2014));
        
        allSongs.add(rock);
        rock.add(new Song("Centuries", "Fall Out Boy", 2014));
        
        DJ ak = new DJ(allSongs);
        ak.getSongList();
    }
    
}