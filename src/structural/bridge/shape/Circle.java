package structural.bridge.shape;

public class Circle extends Shape {
    
    private int x, y, radius;
    
    public Circle(int x, int y, int r, DrawAPI da) {
        super(da);
        this.x = x;
        this.y = y;
        radius = r;
    }
    
    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
    
}