package behavioral.observer.numbers;

public class Octal extends Observer {
    
    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
    
}