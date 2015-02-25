package behavioral.memento.state;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    
    private List<Memento> mementos = new ArrayList<>();
    
    public void add(Memento s) {
        mementos.add(s);
    }
    
    public Memento get(int i) {
        return mementos.get(i);
    }
    
}