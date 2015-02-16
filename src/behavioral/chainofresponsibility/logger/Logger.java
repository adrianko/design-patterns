package behavioral.chainofresponsibility.logger;

public class Logger {

    private static AbstractLogger getLogChain() {
        AbstractLogger err = new Error(AbstractLogger.ERROR);
        AbstractLogger file = new File(AbstractLogger.DEBUG);
        AbstractLogger console = new Console(AbstractLogger.INFO);

        err.setNext(file);
        file.setNext(console);

        return err;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getLogChain();
        logger.logMessage(AbstractLogger.INFO, "This is information");
        logger.logMessage(AbstractLogger.DEBUG, "This is debug level");
        logger.logMessage(AbstractLogger.ERROR, "This is an error message");
    }

}