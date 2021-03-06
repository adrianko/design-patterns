package behavioral.mediator.trading;

public class StockOffer {
    
    private int shares = 0;
    private String symbol = "";
    private int colleagueCode = 0;
    
    public StockOffer(int numShares, String stock, int collCode) {
        shares = numShares;
        symbol = stock;
        colleagueCode = collCode;
    }
    
    public int getShares() {
        return shares;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public int getColleagueCode() {
        return colleagueCode;
    }
    
}