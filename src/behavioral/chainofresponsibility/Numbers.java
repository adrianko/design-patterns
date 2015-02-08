package behavioral.chainofresponsibility;

public class Numbers {
    
    private int n1;
    private int n2;
    
    private String calculation;
    
    public Numbers(int p, int q, String c) {
        n1 = p;
        n2 = q;
        calculation = c;
    }
    
    public int getN1() {
        return n1;
    }
    
    public int getN2() {
        return n2;
    }
    
    public String getCalculation() {
        return calculation;
    }
    
}