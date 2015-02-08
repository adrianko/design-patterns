package creational.abstractfactory.shape;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (factory.equalsIgnoreCase("COLOUR")) {
            return new ColourFactory();
        }

        return null;
    }

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        AbstractFactory colourFactory = FactoryProducer.getFactory("COLOUR");

        Colour colour1 = colourFactory.getColour("RED");
        colour1.fill();

        Colour colour2 = colourFactory.getColour("Green");
        colour2.fill();

        Colour colour3 = colourFactory.getColour("BLUE");
        colour3.fill();
    }

}