package mediator;

import java.util.ArrayList;

public class StockMediator implements Mediator {
    
    private ArrayList<Colleague> colleagues = new ArrayList<>(); ;
    private ArrayList<StockOffer> stockBuyOffers = new ArrayList<>();
    private ArrayList<StockOffer> stockSaleOffers = new ArrayList<>();
    
    private int colleagueCodes = 0;
    
    @Override
    public void saleOffer(String stock, int shares, int collCode) {
        boolean stockSold = false;
        
        for (StockOffer o : stockBuyOffers) {
            if (o.getSymbol().equals(stock) && o.getShares() == shares) {
                System.out.println(shares + " shares of " + stock + " sold to colleague code " + o.getColleagueCode());
                stockBuyOffers.remove(o);
                stockSold = true;
            }
            
            if (stockSold) {
                break;
            }
        }
        
        if (!stockSold) {
            System.out.println(shares + " shares of " + stock + " added to inventory");
            stockSaleOffers.add(new StockOffer(shares, stock, collCode));
        }
    }

    @Override
    public void buyOffer(String stock, int shares, int collCode) {

    }

    @Override
    public void addColleague(Colleague c) {
        colleagues.add(c);
        colleagueCodes++;
        c.setColleagueCode(colleagueCodes);
    }
}