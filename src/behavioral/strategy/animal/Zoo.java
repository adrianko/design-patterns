package behavioral.strategy.animal;

public class Zoo {

    /**
     * Strategy pattern - when one of several behaviours is required dynamically
     * among numerous subclasses without required the duplication of methods within
     * those subclasses
     * @param args
     */
    public static void main(String[] args) {
        Animal spot = new Dog();
        Animal squark = new Bird();

        System.out.println("Spot: " + spot.tryToFly());
        System.out.println("Squark: " + squark.tryToFly());
    }

}