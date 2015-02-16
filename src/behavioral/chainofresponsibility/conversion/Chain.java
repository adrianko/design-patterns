package behavioral.chainofresponsibility.conversion;

public interface Chain {
    
    public void setNext(Chain n);
    public void calculate(Numbers r);
    public static Chain build(Chain c) {
        return null;
    }
    
}