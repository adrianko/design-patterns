package behavioral.mediator.chatroom;

public class Website {

    /**
     * Mediator - used to reduce communication complexity between multiple objects or classes. Provides a mediator class
     * which normally handles all the communications between different classes and supports easy maintenance of the code
     * by loose coupling.
     * @param args
     */
    public static void main(String[] args) {
        User ak = new User("AK");
        User jj = new User("JJ");

        ak.sendMessage("Hi!");
        jj.sendMessage("Hello World");
    }

}