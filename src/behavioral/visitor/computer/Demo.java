package behavioral.visitor.computer;

public class Demo {
    
    public static void main(String[] args) {
        ComputerComponent computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
    
}