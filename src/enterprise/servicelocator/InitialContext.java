package enterprise.servicelocator;

public class InitialContext {

    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICEONE")) {
            System.out.println("Looking up and creating a new ServiceOne object");

            return new ServiceOne();
        } else if (jndiName.equalsIgnoreCase("SERVICETWO")) {
            System.out.println("Looking up and creating a new ServiceTwo object");

            return new ServiceTwo();
        }

        return null;
    }

}