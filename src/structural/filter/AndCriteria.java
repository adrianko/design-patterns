package structural.filter;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria c, Criteria o) {
        criteria = c;
        otherCriteria = o;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return otherCriteria.meetCriteria(criteria.meetCriteria(persons));
    }

}