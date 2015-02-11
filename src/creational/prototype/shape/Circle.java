package creational.prototype.shape;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    public void draw() {
        System.out.println("Circle::draw()");
    }
}