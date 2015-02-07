package servicelocator;

public class ServiceTwo implements Service {

    @Override
    public String getName() {
        return "ServiceTwo";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service Two");
    }

}