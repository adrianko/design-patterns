package behavioral.mediator.trading;

public class MorganStanley extends Colleague {

    public MorganStanley(Mediator m) {
        super(m);
        System.out.println("Morgan Stanley signed up with the exchange.");
    }
    
}