package behavioral.visitor.computer;

public class Monitor implements ComputerComponent {
    
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);    
    }
    
}