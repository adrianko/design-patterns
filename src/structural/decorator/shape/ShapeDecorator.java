package structural.decorator.shape;

public abstract class ShapeDecorator implements Shape {
    
    protected Shape decoratedShape;
    
    @Override
    public void draw() {
        decoratedShape.draw();
    }
    
}