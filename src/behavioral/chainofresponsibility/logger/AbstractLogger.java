package behavioral.chainofresponsibility.logger;

public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger next;

    public void setNext(AbstractLogger nl) {
        next = nl;
    }

    public void logMessage(int level, String message) {
        if (this.level == level) {
            write(message);
        }

        if (next != null) {
            next.logMessage(level, message);
        }
    }

    protected abstract void write(String message);

}