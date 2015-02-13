package behavioral.observer.numbers;

public class Binary extends Observer {
    
    public Binary(Subject s) {
        subject = s;
        subject.attach(this);
    } 
    
    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
    
}