package creational.singleton.message;

public class Message {

    /**
     * Singleton - only 1 instance of the object is allowed to exist and is stored in the class itself.
     * Attempting to run line 11 will result in a compile time error since the constructor is private.
     * @param args
     */
    public static void main(String[] args) {
        //Singleton s = new Singleton();
        Singleton s = Singleton.getInstance();
        s.showMessage();
    }

}