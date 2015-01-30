package proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fn) {
        fileName = fn;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

}