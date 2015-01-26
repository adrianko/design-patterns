package mvc;

public class Calculator {

    /**
     * MVC separates calculations and data from the interface. Model contains the
     * data and the methods to use the data. The View is the interface. The
     * Controller coordinates interactions between the Model and View.
     * @param args
     */
    public static void main(String[] args) {
        View v = new View();
        Model m = new Model();
        Controller c = new Controller(v, m);
        v.setVisible(true);
    }

}