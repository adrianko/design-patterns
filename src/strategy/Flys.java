package strategy;

public interface Flys {

    String fly();

}

class ItFlys implements Flys {

    public String fly() {
        return "flying";
    }

}

class CantFly implements Flys {

    public String fly() {
        return "can't fly";
    }

}