package behavioral.observer.stocks;

public interface Observer {

    public void update(double ibmPrice, double aaplPrice, double googPrice);

}