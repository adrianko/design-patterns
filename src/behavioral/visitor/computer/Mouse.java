package behavioral.visitor.computer;

public class Mouse implements ComputerComponent {
    
    @Override
    public void accept(ComputerPastVisitor computerPastVisitor) {
        computerPastVisitor.visit(this);
    }
    
}