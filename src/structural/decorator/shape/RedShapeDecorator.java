package structural.decorator.shape;

public class RedShapeDecorator  extends ShapeDecorator {
    
    public RedShapeDecorator(Shape ds) {
        super(ds);
    }
    
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    
    public void setRedBorder(Shape ds) {
        System.out.println("Borer Colour: Red");
    }
    
}