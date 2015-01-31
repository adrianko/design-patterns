package businessdelegate;

public class Run {

    public static void main(String[] args) {
        BusinessDelegate bd = new BusinessDelegate();
        bd.setServiceType("EJB");

        Client c = new Client(bd);
        c.doTask();
    }

}