package interceptingfilter;

public class Client {
    
    FilterManager filterManager;
    
    public void setFilterManager(FilterManager fm) {
        filterManager = fm;    
    }
    
    public void sendRequest(String r) {
        filterManager.filterRequest(r);
    }

    /**
     * Intercepting Filter - When pre-processing/post-processing is required with 
     * request or response of application. Filters are defined and applied on the
     * request before padding the request to actual target application.
     * @param args
     */
    public static void main(String[] args) {
        FilterManager fm = new FilterManager(new Target());
        fm.setFilter(new AuthenticationFilter());
        fm.setFilter(new DebugFilter());
        
        Client c = new Client();
        c.setFilterManager(fm);
        c.sendRequest("HOME");
    }
    
}