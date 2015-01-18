package singleton;

import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {
    
    private static Singleton instance = null;

    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
            "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
            "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
            "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
            "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
            "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    private LinkedList<String> letterList = new LinkedList<String> (Arrays.asList(scrabbleLetters));


    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        
        return instance;
    }
    
    public LinkedList<String> getLetterList() {
        return instance.letterList;
    }
    
    public LinkedList<String> getTiles(int numTiles) {
        LinkedList<String> send = new LinkedList<String>();
        
        for(int i = 0; i <= numTiles; i++) {
            send.add(instance.letterList.remove(0));
        }
        
        return send;
    }
    
}