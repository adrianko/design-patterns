package interceptingfilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    
    private List<Filter> filters = new ArrayList<>();
    private Target target;
    
}
