package servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private List<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public Service getService(String serviceName) {

        for (Service s : services) {
            if (s.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached " + serviceName + " object");

                return s;
            }
        }

        return null;
    }

}