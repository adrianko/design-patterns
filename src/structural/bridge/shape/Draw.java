package structural.bridge.shape;

public class Draw {

    /**
     * Bridge - decouple an abstraction from its implementation so that two can vary independently.
     * Involves an interface acting as a bridge which makes the functionality of concrete classes
     * independent from interface implementer classes. Both types can be altered structurally without
     * affecting each other.
     * @param args
     */
    public static void main(String[] args) {
        Shape red = new Circle(100, 100, 10, new RedCircle());
        Shape green = new Circle(100, 100, 10, new GreenCircle());
        
        red.draw();
        green.draw();
    }
    
}