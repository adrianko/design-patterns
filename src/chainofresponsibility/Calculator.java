package chainofresponsibility;

public class Calculator {

    /**
     * A group of objects are expected to between them be able to solve a problem,
     * if the first object can't solve it, it passes the data to the next object 
     * in the chain.
     * @param args
     */
    public static void main(String[] args) {
        Chain chainCalc1 = new Add();
        Chain chainCalc2 = new Subtract();
        Chain chainCalc3 = new Multiply();
        Chain chainCalc4 = new Divide();

        chainCalc1.setNext(chainCalc2);
        chainCalc2.setNext(chainCalc3);
        chainCalc3.setNext(chainCalc4);
        
        Numbers request = new Numbers(4, 2, "add");

        chainCalc1.calculate(request);
        
        Chain c = Add.build(Subtract.build(Multiply.build(new Divide())));
        
        c.calculate(new Numbers(4, 2, "div"));
    }
    
}