package behavioral.strategy.animal;

public class Dog extends Animal {

    public Dog() {
        super.setFlyingType(new CantFly());
    }

}