package creational.prototype.shape;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeID) {
        Shape cachedShape = shapeMap.get(shapeID);

        return (Shape) cachedShape.clone();
    }

}