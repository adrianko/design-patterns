package proxy;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fn) {
        fileName = fn;
    }

    @Override
    public void display() {

    }

}