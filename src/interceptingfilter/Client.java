package interceptingfilter;

public class Client {
    
    FilterManager filterManager;
    
    public void setFilterManager(FilterManager fm) {
        filterManager = fm;    
    }
    
    public void sendRequest(String r) {
        filterManager.filterRequest(r);
    }
    
    public static void main(String[] args) {
        FilterManager fm = new FilterManager(new Target());
        fm.setFilter(new AuthenticationFilter());
        fm.setFilter(new DebugFilter());
        
    }
    
}