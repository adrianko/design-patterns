package structural.flyweight.shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    
    private static final Map<String, Shape> circles = new HashMap<>();
    
    public static Shape getCircle(String colour) {
        Circle c = (Circle) circles.get(colour);    
        
        if (c == null) {
            c = new Circle(colour);
            circles.put(colour, c);
            System.out.println("Creating circle of colour: " + colour);
        }
        
        return c;
    }
    
}