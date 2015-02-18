package behavioral.strategy.calculator;

public class Calculator {

    public static void main(String[] args) {
        Context c1 = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + c1.executeStrategy(10, 5));

        Context c2 = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + c2.executeStrategy(10, 5));
    }

}