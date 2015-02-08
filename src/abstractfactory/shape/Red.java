package abstractfactory.shape;

public class Red implements Colour {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }

}