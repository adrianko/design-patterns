package behavioral.visitor.computer;

public class Computer implements ComputerComponent {
    
    ComputerComponent[] parts;
    
    public Computer() {
        parts = new ComputerComponent[] { new Mouse(), new Keyboard(), new Monitor() };
    }
    
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++)  {
            parts[i].accept(computerPartVisitor);
        }

        computerPartVisitor.visit(this);
    }
    
}