package behavioral.observer.numbers;

public class Hex extends Observer {

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
    
}