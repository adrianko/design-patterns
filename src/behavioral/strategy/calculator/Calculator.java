package behavioral.strategy.calculator;

public class Calculator {

    /**
     * Strategy - A class behaviour or its algorithm can be changed at runtime. Various operation objects represent strategies
     * and a context object whose behaviour varies as per its strategy object. The strategy object changes the executing
     * algorithm of the context object.
     * @param args
     */
    public static void main(String[] args) {
        Context c1 = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + c1.executeStrategy(10, 5));

        Context c2 = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + c2.executeStrategy(10, 5));

        Context c3 = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + c3.executeStrategy(10, 5));
    }

}