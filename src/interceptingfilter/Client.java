package interceptingfilter;

public class Client {
    
    FilterManager filterManager;
    
    public void setFilterManager(FilterManager fm) {
        filterManager = fm;    
    }
    
    public void sendRequest(String r) {
        filterManager.filterRequest(r);
    }
    
}