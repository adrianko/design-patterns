package behavioral.iterator.songs;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<>();
    int hashKey = 0;

    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }
    
    public Hashtable<Integer, SongInfo> getBestSongs(){
        return bestSongs;
    }
    
    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
    
}