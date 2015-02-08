package enterprise.compositeentity;

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

    /**
     * Composite Entity is used in the EJB persistance mechanism. A composite
     * entity is an EJB entity bean which represents a graph of objects. When a
     * composite entity is updated, internally dependent objects get updated
     * automatically as being managed by the EJB entity bean.
     * @param args
     */
    public static void main(String[] args) {
        Client c = new Client();
        c.setData("Hello", "World");
        c.printData();
        c.setData("Again", "And Again");
        c.printData();
    }

}