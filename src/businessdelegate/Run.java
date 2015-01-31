package businessdelegate;

public class Run {

    /**
     * Business Delegate - used to decouple presentation tier and
     * business tier. Reduces communication or remote lookup
     * functionality to business tier code in presentation tier code.
     * @param args
     */
    public static void main(String[] args) {
        BusinessDelegate bd = new BusinessDelegate();
        bd.setServiceType("EJB");

        Client c = new Client(bd);
        c.doTask();

        bd.setServiceType("JMS");
        c.doTask();
    }

}