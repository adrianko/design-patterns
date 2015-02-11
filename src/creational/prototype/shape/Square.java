package creational.prototype.shape;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    public void draw() {
        System.out.println("Square::draw()");
    }
    
}