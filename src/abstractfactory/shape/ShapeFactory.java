package abstractfactory.shape;

public class ShapeFactory extends AbstractFactory {

    @Override
    Colour getColour(String colour) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }

}