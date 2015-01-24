package composite;

public class Playlist {
    
    public static void main(String[] args) {
        SongComponent pop = new SongGroup("Pop", "Popular music");
        SongComponent rock = new SongGroup("Rock", "Rock music");
        SongComponent rap = new SongGroup("Rap", "Rap music");
        
        SongComponent allSongs = new SongGroup("Song List", "All");
        
        allSongs.add(pop);
        allSongs.add(rock);
        allSongs.add(rap);
        
        
    }
    
}