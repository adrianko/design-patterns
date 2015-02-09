package behavioral.visitor.computer;

public class Keyboard implements ComputerComponent {
    
    @Override
    public void accept(ComputerPastVisitor computerPastVisitor) {
        computerPastVisitor.visit(this);
    }
    
}