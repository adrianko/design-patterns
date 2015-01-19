package chainofresponsibility;

public class Divide implements Chain {

    private Chain next;

    @Override
    public void setNext(Chain n) {
        next = n;
    }

    @Override
    public void calculate(Numbers r) {
        if (r.getCalculation().equals("div")) {
            System.out.println(r.getN1() + " / " + r.getN2() + " = " + (r.getN1() / r.getN2()));
        } else {
            System.out.println("Cannot parse expression");
        }
    }
    
}