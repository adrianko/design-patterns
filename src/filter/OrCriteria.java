package filter;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria c, Criteria o) {
        criteria = c;
        otherCriteria = o;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> f = criteria.meetCriteria(persons);
        List<Person> o = otherCriteria.meetCriteria(persons);

        f.addAll(o);

        return f;
    }

}