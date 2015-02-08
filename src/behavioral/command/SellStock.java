package behavioral.command;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock s) {
        abcStock = s;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }

}