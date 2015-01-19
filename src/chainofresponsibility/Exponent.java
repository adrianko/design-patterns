package chainofresponsibility;

public class Exponent implements Chain {

    private Chain next;
    
    @Override
    public void setNext(Chain n) {
        next = n;
    }

    @Override
    public void calculate(Numbers r) {
        if (r.getCalculation().equals("exp")) {
            System.out.println(r.getN1() + " ^ " + r.getN2() + " = " + (Math.pow(r.getN1(), r.getN2())));
        } else if(next != null) {
            next.calculate(r);
        } else {
            System.out.println("Cannot parse expression");
        }
    }

    public static Exponent build(Chain c) {
        Exponent e = new Exponent();
        e.setNext(c);

        return e;
    }
    
}