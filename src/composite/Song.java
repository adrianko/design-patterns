package composite;

public class Song extends SongComponent {
    
    String songName;
    String artist;
    int releaseYear;
    
    public Song(String sn, String ar, int ry) {
        songName = sn;
        artist = ar;
        releaseYear = ry;
    }
    
    @Override
    public String getSongName() {
        return songName;
    }
    
    @Override
    public String getArtist() {
        return artist;
    }
    
    @Override
    public int getReleaseYear() {
        return releaseYear;
    }
    
    @Override
    public void displaySongInfo() {
        System.out.println(getSongName() + " was recorded by  " + getArtist() + " in " + getReleaseYear());
    }
    
}