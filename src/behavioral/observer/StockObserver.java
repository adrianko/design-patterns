package behavioral.observer;

public class StockObserver implements Observer {

    private int observerID;
    private Subject stockGrabber;

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    public StockObserver(Subject sg) {
        stockGrabber = sg;
        observerID = ++observerIDTracker;
        stockGrabber.register(this);
    }

    @Override
    public void update(double newIBMPrice, double newAAPLPrice, double newGOOGPrice) {
        ibmPrice = newIBMPrice;
        aaplPrice = newAAPLPrice;
        googPrice = newGOOGPrice;

        printStocks();
    }

    public void printStocks() {
        System.out.println("ObserverID: "+observerID);
        System.out.println("IBM: "+ibmPrice);
        System.out.println("AAPL: "+aaplPrice);
        System.out.println("GOOGL: "+googPrice);
    }

}