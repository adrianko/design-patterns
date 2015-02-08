package factory.shape;

public class ShapeFactory {

    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }

    /**
     * Factory pattern - creational
     * An object is created on request without exposing the creation logic to the client and reference to the newly
     * created object is done using a common interface.
     * @param args
     */
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape s1 = sf.getShape("CIRCLE");
        s1.draw();

        Shape s2 = sf.getShape("RECTANGLE");
        s2.draw();

        Shape s3 = sf.getShape("SQUARE");
        s3.draw();

        Shape s4 = sf.getShape("OVAL");
        //s4.draw();
    }

}