package behavioral.observer.stocks;

public class GrabStocks {

    /**
     * When StockObserver objects are created, they are auto registered with the
     * StockGrabber. When a stock is updated, the observers are notified by calling
     * the update method in each StockObserver, thus changing the stock price in
     * every object.
     * @param args
     */
    public static void main(String[] args) {
        StockGrabber sg = new StockGrabber();
        StockObserver o1 = new StockObserver(sg);
        StockObserver o2 = new StockObserver(sg);
        sg.setIBMPrice(200.00);
        sg.setAAPLPrice(900.00);
        sg.setGOOGPrice(800.00);
        sg.unregister(o2);
        sg.setIBMPrice(350.00);
    }

}