package proxy;

public class Loader {

    public static void main(String[] args) {
        Image im = new ProxyImage("test.jpg");
        im.display();
        System.out.println();
        im.display();
    }

}