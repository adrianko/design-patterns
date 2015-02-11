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
    
    public static void main(String[] args) {
        String[] colours = {"Red", "Green", "Blue", "White", "Black"};
        
        for (int i = 0; i < 50; i++) {
            Circle c = (Circle) ShapeFactory.getCircle(colours[(int) (Math.random() * colours.length)]);
            c.setX((int) (Math.random() * 100));
            c.setY((int) (Math.random() * 100));
            c.setRadius(100);
            c.draw();
        }
    }
    
}