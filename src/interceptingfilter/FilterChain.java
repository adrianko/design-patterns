package interceptingfilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    
    private List<Filter> filters = new ArrayList<>();
    private Target target;
    
    public void addFilter(Filter f) {
        filters.add(f);
    }
    
    public void execute(String request) {
        for (Filter f : filters) {
            f.execute(request);
        }
        
        target.execute(request);
    }
    
    public void setTarget(Target t) {
        target = t;
    }
    
}