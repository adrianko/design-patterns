package compositeentity;

public class Client {

    private CompositeEntity ce = new CompositeEntity();

    public void printData() {
        for (String d : ce.getData()) {
            System.out.println("Data: " + d);
        }
    }

    public void setData(String d1, String d2) {
        ce.setData(d1, d2);
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.setData("Hello", "World");
        c.printData();
        c.setData("Again", "And Again");
        c.printData();
    }

}