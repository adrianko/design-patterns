package chainofresponsibility;

public interface Chain {
    
    public void setNext(Chain n);
    public void calculate(Numbers r);
    
}