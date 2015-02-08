package abstractfactory.shape;

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
        
    }

}