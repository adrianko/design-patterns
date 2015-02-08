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

    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape s1 = sf.getShape("CIRCLE");
        s1.draw();

        Shape s2 = sf.getShape("RECTANGLE");
        s2.draw();

        Shape s3 = sf.getShape("SQUARE");
        s3.draw();
    }

}