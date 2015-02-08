package behavioral.memento;

import java.util.ArrayList;

public class Caretaker {
    
    ArrayList<Memento> saved = new ArrayList<>();
    
    public void add(Memento m) {
        saved.add(m);
    }
    
    public Memento get(int i) {
        return saved.get(i);
    }
    
}