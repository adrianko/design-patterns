package behavioral.visitor.computer;

public class Mouse implements ComputerComponent {
    
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
    
}