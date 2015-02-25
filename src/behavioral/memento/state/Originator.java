package behavioral.memento.state;

public class Originator {
    
    private String state;
    
    public void setState(String s) {
        state = s;
    }
    
    public String getState() {
        return state;
    }
    
    public Memento saveState() {
        return new Memento(state);
    }
    
    public void getState(Memento m) {
        state = m.getState();
    }
    
}