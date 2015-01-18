package strategy;

public class Bird extends Animal {

    public Bird() {
        super.setFlyingType(new CanFly());
    }

}