package behavioral.chainofresponsibility.logger;

public class Console extends AbstractLogger {

    public Console(int l) {
        level = l;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }

}