package proxy;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fn) {
        fileName = fn;
        loadFileFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFileFromDisk(String fn) {
        System.out.println("Loading " + fn);
    }

}