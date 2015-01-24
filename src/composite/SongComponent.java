package composite;

public abstract class SongComponent {
    
    public void add(SongComponent sc) {
        throw new UnsupportedOperationException();
    }
    
    public void remove(SongComponent sc) {
        throw new UnsupportedOperationException();
    }
    
    public SongComponent getComponent(int i) {
        throw new UnsupportedOperationException();
    }
    
    public String getSongName() {
        throw new UnsupportedOperationException();
    }
    
    public String getArtist() {
        throw new UnsupportedOperationException();
    }
    
    public int getReleaseYear() {
        throw new UnsupportedOperationException();
    }
    
    public void displaySongInfo() {
        throw new UnsupportedOperationException();
    }
    
}