package behavioral.iterator.songs;

import java.util.Iterator;

public class DJ {

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

    public DJ(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {
        iter70sSongs = newSongs70s;
        iter80sSongs = newSongs80s;
        iter90sSongs = newSongs90s;
    }

    public void showTheSongs(){
        System.out.println("Songs of the 70s\n");
        printTheSongs(iter70sSongs.createIterator());

        System.out.println("Songs of the 80s\n");
        printTheSongs(iter80sSongs.createIterator());

        System.out.println("Songs of the 90s\n");
        printTheSongs(iter90sSongs.createIterator());
    }

    public void printTheSongs(Iterator iterator) {
        while (iterator.hasNext()) {
            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased() + "\n");

        }
    }

}