package behavioral.mediator.chatroom;

public class User {

    private String name;

    public User(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void sendMessage(String m) {
        ChatRoom.showMessage(this, m);
    }

}