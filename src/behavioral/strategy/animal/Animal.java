package behavioral.strategy.animal;

public class Animal {

    public Fly flyingType;

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingType(Fly newFlyType) {
        flyingType = newFlyType;
    }

}