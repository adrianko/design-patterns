package enterprise.businessdelegate;

public class BusinessLookUp {

    public BusinessService getBusinessService(String st) {
        if (st.equalsIgnoreCase("EJB")) {
            return new EJBService();
        }
        return new JMSService();
    }

}