package behavioral.iterator.songs;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();
    
    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
    
}