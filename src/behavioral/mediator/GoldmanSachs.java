package behavioral.mediator;

public class GoldmanSachs extends Colleague {
    
    public GoldmanSachs(Mediator m) {
        super(m);
        System.out.println("Goldman Sachs signed up with the exchange");
    }
    
}