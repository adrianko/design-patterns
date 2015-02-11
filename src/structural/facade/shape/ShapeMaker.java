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
    
    public void drawCircle() {
        circle.draw();
    }
    
    public void drawRectangle() {
        rectangle.draw();
    }
    
    public void drawSquare() {
        square.draw();
    }

    /**
     * Facade - hides complexities of the system and provides an interface to the client using which the client can
     * access the system. Single class provides simplified methods required by client and delegates calls to methods
     * of existing system classes.
     * @param args
     */
    public static void main(String[] args) {
        ShapeMaker sm = new ShapeMaker();
        sm.drawCircle();
        sm.drawRectangle();
        sm.drawSquare();
    }
    
}