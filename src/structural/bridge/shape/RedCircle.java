package structural.bridge.shape;

public class RedCircle implements DrawAPI {
    
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle [ colour: red, radius: " + radius + " x: " + x + " y: " + y + "]");
    }
    
}