package behavioral.visitor.computer;

public interface ComputerPastVisitor {
    
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
    
}