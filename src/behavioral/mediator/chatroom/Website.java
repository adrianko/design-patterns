package behavioral.mediator.chatroom;

public class Website {

    public static void main(String[] args) {
        User ak = new User("AK");
        User jj = new User("JJ");

        ak.sendMessage("Hi!");
        jj.sendMessage("Hello World");
    }

}