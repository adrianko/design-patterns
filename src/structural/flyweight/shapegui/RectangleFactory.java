package structural.flyweight.shapegui;

import java.awt.*;
import java.util.HashMap;

public class RectangleFactory {
    
    private static final HashMap<Color, structural.flyweight.shapegui.Rectangle> rectangles = new HashMap<>();
    
    public static structural.flyweight.shapegui.Rectangle getRectangle(Color c) {
        structural.flyweight.shapegui.Rectangle r = rectangles.get(c);
        
        if (r == null) {
            r = new structural.flyweight.shapegui.Rectangle(c);
            
            rectangles.put(c, r);
        }
        
        return r;
    }
}
