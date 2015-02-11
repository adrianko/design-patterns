package structural.facade.shape;

public class ShapeMaker {
    
    private Shape circle;
    private Shape rectangle;
    private Shape square;
    
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    
}