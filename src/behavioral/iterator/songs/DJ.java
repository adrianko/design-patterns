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
        Iterator Songs70s = iter70sSongs.createIterator();
        Iterator Songs80s = iter80sSongs.createIterator();
        Iterator Songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(Songs70s);

        System.out.println("Songs of the 80s\n");
        printTheSongs(Songs80s);

        System.out.println("Songs of the 90s\n");
        printTheSongs(Songs90s);

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