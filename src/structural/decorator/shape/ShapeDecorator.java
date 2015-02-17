package structural.decorator.shape;

public abstract class ShapeDecorator implements Shape {
    
    protected Shape decoratedShape;
    
    public ShapeDecorator(Shape ds) {
        decoratedShape = ds;
    }
    
    @Override
    public void draw() {
        decoratedShape.draw();
    }
    
}