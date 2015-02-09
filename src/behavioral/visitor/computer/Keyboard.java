package behavioral.visitor.computer;

public class Keyboard implements ComputerComponent {
    
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
    
}
