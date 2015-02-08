package creational.singleton;

import java.util.LinkedList;

public class Scrabble {

    /**
     * Only a single instance of the creational.singleton class can be created.
     * Creating a new instance references the same object
     * @param args
     */
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();

        System.out.println("1st Instance ID: " + System.identityHashCode(s1));
        System.out.println(s1.getLetterList());

        LinkedList<String> p1Tiles = s1.getTiles(7);
        System.out.println("Player 1: "+ p1Tiles);
        
        Singleton s2 = Singleton.getInstance();

        System.out.println("2nd Instance ID: " + System.identityHashCode(s2));
        System.out.println(s2.getLetterList());

        LinkedList<String> p2Tiles = s2.getTiles(7);
        System.out.println("Player 2: "+ p2Tiles);
    }
    
}