package behavioral.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(observers.indexOf(o));
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach(o -> o.update(ibmPrice, aaplPrice, googPrice));
    }

    public void setIBMPrice(double newIBMPrice) {
        ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice) {
        aaplPrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice) {
        googPrice = newGOOGPrice;
        notifyObserver();
    }

}