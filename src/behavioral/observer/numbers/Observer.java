package behavioral.observer.numbers;

public abstract class Observer {
    
    protected Subject subject;
    public abstract void update();
    
}