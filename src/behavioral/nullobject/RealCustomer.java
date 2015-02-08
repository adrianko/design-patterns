package behavioral.nullobject;

public class RealCustomer extends AbstractCustomer {
    
    public RealCustomer(String n) {
        name = n;
    }
    
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
    
}