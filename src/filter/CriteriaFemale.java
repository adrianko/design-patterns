package filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> female = new ArrayList<>();

        for (Person p : persons) {
            if (p.getGender().equalsIgnoreCase("FEMALE")) {
                female.add(p);
            }
        }

        return female;
    }

}