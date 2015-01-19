package chainofresponsibility;

public class Multiply implements Chain {

    private Chain next;

    @Override
    public void setNext(Chain n) {
        next = n;
    }

    @Override
    public void calculate(Numbers r) {
        if (r.getCalculation().equals("mult")) {
            System.out.println(r.getN1() + " * " + r.getN2() + " = " + (r.getN1() * r.getN2()));
        } else {
            next.calculate(r);
        }
    }

    public static Multiply build(Chain c) {
        Multiply m = new Multiply();
        m.setNext(c);
        
        return m;
    }
    
}