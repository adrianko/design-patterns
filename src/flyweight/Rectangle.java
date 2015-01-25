package flyweight;

import java.awt.*;

public class Rectangle {
    
    private Color c = Color.black;
    private int x, y, x2, y2;
    
    public Rectangle(Color cl) {
        c = cl;
    }
    
    public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY) {
        g.setColor(c);
        g.fillRect(upperX, upperY, lowerX, lowerY);
    }
    
}