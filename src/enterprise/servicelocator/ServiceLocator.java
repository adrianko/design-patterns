package enterprise.servicelocator;

public class ServiceLocator {

    private static Cache cache;
    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {
        Service s = cache.getService(jndiName);

        if (s != null) {
            return s;
        }

        InitialContext context = new InitialContext();
        Service s1 = (Service) context.lookup(jndiName);
        cache.addService(s1);

        return s1;
    }

    /**
     * Service Locator - used when services are to be located using JNDI lookup. Makes use of caching technique since
     * there is a high cost looking up JNDI for a service. The first time a service is required, Service Locator looks
     * up JNDI and caches the service object.
     * @param args
     */
    public static void main(String[] args) {
        Service s = ServiceLocator.getService("ServiceOne");
        s.execute();

        s = ServiceLocator.getService("ServiceTwo");
        s.execute();

        s = ServiceLocator.getService("ServiceOne");
        s.execute();

        s = ServiceLocator.getService("ServiceTwo");
        s.execute();
    }

}