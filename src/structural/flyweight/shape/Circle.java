package structural.flyweight.shape;

public class Circle implements Shape {
    
    private String colour;
    private int x;
    private int y;
    private int radius;
    
    public Circle(String c) {
        colour = c;
    }
    
    @Override
    public void draw() {
        
    }
    
}