package nullobject;

public class CustomerList {

    /**
     * Null Object replaces check of NULL object instance. Instead of putting if
     * check for a null value, Null Object reflects a do nothing relationship.
     * i.e. a default value if the requested one doesn't exist.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(CustomerFactory.getCustomer("Rob").getName());
        System.out.println(CustomerFactory.getCustomer("Bob").getName());
        System.out.println(CustomerFactory.getCustomer("Julie").getName());
        System.out.println(CustomerFactory.getCustomer("Laura").getName());
    }
    
}