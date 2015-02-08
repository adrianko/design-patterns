package structural.proxy;

public class Loader {

    /**
     * The structural.proxy loads the real image and caches it, therefore when the image
     * is called again, it doesn't have to be recalled from disk. The cached
     * version is returned.
     * @param args
     */
    public static void main(String[] args) {
        Image im = new ProxyImage("test.jpg");
        im.display();
        System.out.println();
        im.display();
    }

}