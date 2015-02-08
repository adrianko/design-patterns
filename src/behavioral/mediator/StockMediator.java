package behavioral.mediator;

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
        boolean stockBought = false;
        
        for (StockOffer o : stockSaleOffers) {
            if (o.getSymbol().equals(stock) && o.getShares() == shares) {
                System.out.println(shares + " shares of " + stock + " bought by colleague code " + o.getColleagueCode());
                stockSaleOffers.remove(o);
                stockBought = true;
            }
            
            if (stockBought) {
                break;
            }
        }
        
        if (!stockBought) {
            System.out.println(shares + " shares of " + stock + " added to inventory");
            stockBuyOffers.add(new StockOffer(shares, stock, collCode));
        }
    }

    @Override
    public void addColleague(Colleague c) {
        colleagues.add(c);
        colleagueCodes++;
        c.setColleagueCode(colleagueCodes);
    }
    
    public void getStockOffering() {
        System.out.println("Stocks for Sale");
        
        for (StockOffer o : stockSaleOffers) {
            System.out.println(o.getShares() + " of " + o.getSymbol());
        }

        System.out.println("Stock Buy Offers");
        
        for (StockOffer o : stockBuyOffers) {
            System.out.println(o.getShares() + " of "+ o.getSymbol());
        }
    }
    
}