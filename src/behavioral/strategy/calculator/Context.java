package behavioral.strategy.calculator;

public class Context {

    public Strategy strategy;

    public Context(Strategy s) {
        strategy = s;
    }

}