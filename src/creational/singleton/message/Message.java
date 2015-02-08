package creational.singleton.message;

public class Message {

    /**
     * Singleton - only 1 instance of the object is allowed to exist and is stored in the class itself.
     * Attempting to run line 11 will result in a compile time error since the constructor is private.
     * @param args
     */
    public static void main(String[] args) {
        //Singleton s = new Singleton();
        Singleton s1 = Singleton.getInstance();
        s1.showMessage();

        Singleton s2 = Singleton.getInstance();
        s2.showMessage();

        System.out.println("S1 HashCode: " + s1.hashCode());
        System.out.println("S2 HashCode: " + s2.hashCode());
    }

}