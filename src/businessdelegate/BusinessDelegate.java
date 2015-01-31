package businessdelegate;

public class BusinessDelegate {

    private BusinessLookUp blu = new BusinessLookUp();
    private BusinessService bs;
    private String serviceType;

    public void setServiceType(String st) {
        serviceType = st;
    }

    public void doTask() {
        bs = blu.getBusinessService(serviceType);
        bs.doProcessing();
    }

}