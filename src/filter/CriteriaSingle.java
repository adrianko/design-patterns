package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> single = new ArrayList<>();

        persons.forEach( p -> {
           if (p.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                single.add(p);
            }
        });

        return single;
    }

}