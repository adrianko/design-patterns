package behavioral.chainofresponsibility.logger;

public class File extends AbstractLogger {

    public File(int l) {
        level = l;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }

}