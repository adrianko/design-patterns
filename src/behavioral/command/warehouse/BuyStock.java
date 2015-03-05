package behavioral.command.warehouse;

public class BuyStock implements Order {
    private Stock abcStock;
    
    public BuyStock(Stock s) {
        abcStock = s;      
    }
    
    @Override
    public void execute() {
        abcStock.buy();
    }
    
}