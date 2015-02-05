package interceptingfilter;

public class FilterManager {
    
    FilterChain filterChain;
    
    public FilterManager(Target t) {
        filterChain = new FilterChain();
        filterChain.setTarget(t);
    }
    
    public void setFilter(Filter f) {
        filterChain.addFilter(f);
    }
    
    public void filterRequest(String r) {
        filterChain.execute(r);
    }
    
}