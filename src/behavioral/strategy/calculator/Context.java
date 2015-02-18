package behavioral.strategy.calculator;

public class Context {

    public Strategy strategy;

    public Context(Strategy s) {
        strategy = s;
    }

    public int executeStrategy(int n1, int n2) {
        return strategy.doOperation(n1, n2);
    }

}