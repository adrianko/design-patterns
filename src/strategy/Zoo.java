package strategy;

public class Zoo {

    public static void main(String[] args) {
        Animal spot = new Dog();
        Animal squark = new Bird();

        System.out.println("Spot: " + spot.tryToFly());
        System.out.println("Squark: " + squark.tryToFly());
    }

}
