package structural.flyweight.shape;

public class Circle implements Shape {
    
    private String colour;
    private int x;
    private int y;
    private int radius;
    
    public Circle(String c) {
        colour = c;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setRadius(int r) {
        radius = r;
    }
    
    @Override
    public void draw() {
        
    }
    
}