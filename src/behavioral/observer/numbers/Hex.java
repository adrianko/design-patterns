package behavioral.observer.numbers;

public class Hex extends Observer {
    
    public Hex(Subject s) {
        subject = s;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
    
}