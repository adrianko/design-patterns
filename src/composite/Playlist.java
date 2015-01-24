package composite;

public class Playlist {
    
    public static void main(String[] args) {
        SongComponent pop = new SongGroup("Pop", "Popular music");
        SongComponent rock = new SongGroup("Rock", "Rock music");
        SongComponent rap = new SongGroup("Rap", "Rap music");
    }
    
}