package structural.bridge.shape;

public class Draw {
    
    public static void main(String[] args) {
        Shape red = new Circle(100, 100, 10, new RedCircle());
        Shape green = new Circle(100, 100, 10, new GreenCircle());
        
        red.draw();
        green.draw();
    }
    
}