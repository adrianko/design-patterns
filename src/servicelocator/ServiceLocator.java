package servicelocator;

public class ServiceLocator {

    private static Cache cache;
    static {
        cache = new Cache();
    }

}