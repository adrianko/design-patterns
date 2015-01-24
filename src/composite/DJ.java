package composite;

public class DJ {
    
    SongComponent songList;
    
    public DJ(SongComponent sl) {
        songList = sl;
    }
    
    public void getSongList() {
        songList.displaySongInfo();       
    }
    
}