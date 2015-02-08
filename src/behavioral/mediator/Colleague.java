package behavioral.mediator;

public abstract class Colleague {
    
    private Mediator mediator;
    private int colleagueCode;
    
    public Colleague(Mediator m) {
        mediator = m;
        mediator.addColleague(this);
    }
    
    public void saleOffer(String stock, int shares) {
        mediator.saleOffer(stock, shares, colleagueCode);
    }
    
    public void buyOffer(String stock, int shares) {
        mediator.buyOffer(stock, shares, colleagueCode);
    }
    
    public void setColleagueCode(int collCode) {
        colleagueCode = collCode;
    }
    
}