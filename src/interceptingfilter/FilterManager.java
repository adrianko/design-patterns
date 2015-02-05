package interceptingfilter;

public class FilterManager {
    
    FilterChain filterChain;
    
    public FilterManager(Target t) {
        filterChain = new FilterChain();
        filterChain.setTarget(t);
    }
    
}
