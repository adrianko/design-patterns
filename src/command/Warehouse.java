package command;

public class Warehouse {

    /**
     * Data driven pattern. Request wrapped under an object as command and passed
     * to invoker object. Invoker object looks for appropriate object which can 
     * handle this command and passes command to the corresponding object 
     * which executes
     * @param args
     */
    public static void main(String[] args) {
        Stock s = new Stock();
        BuyStock bs = new BuyStock(s);
        SellStock ss = new SellStock(s);
        
        Broker b = new Broker();
        b.takeOrder(bs);
        b.takeOrder(ss);
        
        b.placeOrders();
    }
    
}