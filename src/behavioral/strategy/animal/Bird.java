package behavioral.strategy.animal;

public class Bird extends Animal {

    public Bird() {
        super.setFlyingType(new CanFly());
    }

}