package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> male = new ArrayList<>();

        persons.forEach( p -> {
            if (p.getGender().equalsIgnoreCase("MALE")) {
                male.add(p);
            }
        });

        return male;
    }

}