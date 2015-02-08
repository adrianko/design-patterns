package behavioral.strategy;

public class Dog extends Animal {

    public Dog() {
        super.setFlyingType(new CantFly());
    }

}