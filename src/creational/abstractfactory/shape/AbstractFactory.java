package creational.abstractfactory.shape;

public abstract class AbstractFactory {

    abstract Colour getColour(String colour);
    abstract Shape getShape(String shape);

}