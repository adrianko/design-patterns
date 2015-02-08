package abstractfactory.shape;

public class Green implements Colour {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }

}