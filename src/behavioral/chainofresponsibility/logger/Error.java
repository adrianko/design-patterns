package behavioral.chainofresponsibility.logger;

public class Error extends AbstractLogger {

    public Error(int i) {
        level = i;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }

}