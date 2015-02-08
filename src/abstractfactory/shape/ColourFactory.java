package abstractfactory.shape;

public class ColourFactory extends AbstractFactory {

    @Override
    Colour getColour(String colour) {
        if (colour.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colour.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (colour.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }

}