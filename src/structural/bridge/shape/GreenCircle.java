package structural.bridge.shape;

public class GreenCircle implements DrawAPI {
    
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle [ colour: green, radius: " + radius + " x: " + x + " y: " + y + "]");
    }
    
}