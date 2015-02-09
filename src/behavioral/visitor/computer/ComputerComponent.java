package behavioral.visitor.computer;

public interface ComputerComponent {
    
    public void accept(ComputerPastVisitor computerPastVisitor);
    
}