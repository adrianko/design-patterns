package structural.decorator.shape;

public class ShapeGenerator {

    /**
     * Decorator - allows adding of new functionality to an existing object without altering its structure. The
     * pattern creates a decorator class which wraps the original class and provides additional functionality
     * keeping class methods signature intact.
     * @param args
     */
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border: ");
        circle.draw();

        System.out.println("\nCircle with red border: ");
        redCircle.draw();

        System.out.println("\nRectangle with red border: ");
        redRectangle.draw();
    }
    
}