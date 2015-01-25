package flyweight;

import javax.swing.*;
import java.awt.*;

public class Generator extends JFrame {
    
    private static final long serialVersionUID = 1L;
    
    JButton startDrawing;
    
    int winW = 1750;
    int winH = 1000;
    
    Color[] shapeColor = { Color.orange, Color.red, Color.yellow, Color.blue, 
            Color.pink, Color.cyan, Color.magenta, Color.black, Color.gray };
    
    public Generator() {
        
    }
    
}