package behavioral.observer.numbers;

public class Conversion {
    
    public static void main(String[] args) {
        Subject s = new Subject();
        
        new Binary(s);
        new Octal(s);
        new Hex(s);

        System.out.println("First state change: 15");
        s.setState(15);

        System.out.println("Second state change: 10");
        s.setState(10);
    }
    
}