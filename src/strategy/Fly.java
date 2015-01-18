package strategy;

public interface Fly {

    String fly();

}

class CanFly implements Fly {

    public String fly() {
        return "flying";
    }

}

class CantFly implements Fly {

    public String fly() {
        return "can't fly";
    }

}