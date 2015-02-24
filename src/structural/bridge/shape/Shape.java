package structural.bridge.shape;

public abstract class Shape {
    
    protected DrawAPI drawAPI;
    
    protected Shape(DrawAPI d) {
        drawAPI = d;
    } 
    
    public abstract void draw();

}