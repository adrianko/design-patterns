package strategy;

public class Animal {

    public Flys flyingType;

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingType(Flys newFlyType) {
        flyingType = newFlyType;
    }

}