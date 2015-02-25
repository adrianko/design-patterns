package behavioral.memento.state;

public class Memento {
    
    private String state;
    
    public Memento(String s) {
        state = s;
    }
    
    public String getState() {
        return state;
    }
    
}