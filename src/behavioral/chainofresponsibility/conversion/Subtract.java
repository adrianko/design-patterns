package behavioral.chainofresponsibility.conversion;

public class Subtract implements Chain {

    private Chain next;

    @Override
    public void setNext(Chain n) {
        next = n;
    }

    @Override
    public void calculate(Numbers r) {
        if (r.getCalculation().equals("sub")) {
            System.out.println(r.getN1() + " - " + r.getN2() + " = " + (r.getN1() - r.getN2()));
        } else {
            next.calculate(r);
        }
    }

    public static Subtract build(Chain c) {
        Subtract s = new Subtract();
        s.setNext(c);
        
        return s;
    }
    
}