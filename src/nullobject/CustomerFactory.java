package nullobject;

import java.util.LinkedList;

public class CustomerFactory {
    
    public static final LinkedList<String> names;
    static {
        LinkedList<String> n = new LinkedList<>();
        n.add("Rob");
        n.add("Joe");
        n.add("Julie");
        names = n;
    }
    
    public static AbstractCustomer getCustomer(String n) {
        if (names.contains(n)) {
            return new RealCustomer(n);
        }
        
        return new NullCustomer();
    }
    
}