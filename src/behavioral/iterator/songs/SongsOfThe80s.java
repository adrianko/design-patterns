package behavioral.iterator.songs;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {
    
    SongInfo[] bestSongs;
    int arrayValue = 0;

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