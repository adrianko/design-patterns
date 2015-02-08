package structural.flyweight;

import java.awt.*;
import java.util.HashMap;

public class RectangleFactory {
    
    private static final HashMap<Color, Rectangle> rectangles = new HashMap<>();
    
    public static Rectangle getRectangle(Color c) {
        Rectangle r = rectangles.get(c);
        
        if (r == null) {
            r = new Rectangle(c);
            
            rectangles.put(c, r);
        }
        
        return r;
    }
}
