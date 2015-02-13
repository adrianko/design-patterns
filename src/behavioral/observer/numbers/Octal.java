package behavioral.observer.numbers;

public class Octal extends Observer {
    
    public Octal(Subject s) {
        subject = s;
        subject.attach(this);
    }
    
    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
    
}