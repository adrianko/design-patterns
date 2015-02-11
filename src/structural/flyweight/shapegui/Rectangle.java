package structural.flyweight.shapegui;

import java.awt.*;

public class Rectangle {
    
    private Color c = Color.black;
    
    public Rectangle(Color cl) {
        c = cl;
    }
    
    public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY) {
        g.setColor(c);
        g.fillRect(upperX, upperY, lowerX, lowerY);
    }
    
}