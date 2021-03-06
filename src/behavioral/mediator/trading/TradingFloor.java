package behavioral.mediator.trading;

public class TradingFloor {

    /**
     * Mediator - used to handle communication between related objects (Colleagues).
     * All communication is handled by a behavioral.mediator object and the colleagues don't
     * need to know anything about each other to work together.
     * @param args
     */
    public static void main(String[] args) {
        StockMediator lse = new StockMediator();
        MorganStanley b1 = new MorganStanley(lse);
        RBS b2 = new RBS(lse);
        GoldmanSachs b3 = new GoldmanSachs(lse);
        
        b1.saleOffer("MSFT", 100);
        b1.saleOffer("GOOG", 50);
        
        b2.buyOffer("MSFT", 100);
        b2.saleOffer("NRG", 10);
        
        b1.buyOffer("NRG", 10);
        
        b3.saleOffer("AAPL", 100);
        b2.buyOffer("AAPL", 20);
        
        lse.getStockOffering();
    }
    
}