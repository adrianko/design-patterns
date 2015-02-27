package behavioral.iterator.songs;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {
    
    SongInfo[] bestSongs;
    
    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
    
}