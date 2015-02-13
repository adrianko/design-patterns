package behavioral.observer.numbers;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    
    private List<Observer> observers = new ArrayList<>();
    private int state;
    
    public int getState() {
        return state;
    }
    
    public void setState(int s) {
        state = s;
    }
    
    public void attach(Observer o) {
        observers.add(o);
    }
    
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
    
}