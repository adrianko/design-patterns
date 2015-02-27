package behavioral.iterator.songs;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {
    
    SongInfo[] bestSongs;
    int arrayValue = 0;

    public SongsOfThe80s() {
        bestSongs = new SongInfo[3];
        addSong("Roam", "B 52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears For Fears", 1985);
    }

    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo song = new SongInfo(songName, bandName, yearReleased);
        bestSongs[arrayValue] = song;
        arrayValue++;
    }

    public SongInfo[] getBestSongs(){
        return bestSongs;
    }
    
    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
    
}