package behavioral.visitor.computer;

public class Monitor implements ComputerComponent {

    @Override
    public void accept(ComputerPastVisitor computerPastVisitor) {
        computerPastVisitor.visit(this);
    }
    
}