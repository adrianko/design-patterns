package behavioral.command.warehouse;

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