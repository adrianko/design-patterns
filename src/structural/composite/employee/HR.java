package structural.composite.employee;

public class HR {

    /**
     * Composite - to treat a group of objects in a similar way as a single object. Composes objects in terms of a tree
     * structure to represent part as well as whole hierarchy
     * @param args
     */
    public static void main(String[] args) {
        Employee ceo = new Employee("John", "CEO", 30000);
        Employee headSales = new Employee("Robert", "Head of Sales", 20000);
        Employee headMkt = new Employee("Michael", "Head of Marketing", 20000);

        ceo.add(headSales);
        ceo.add(headMkt);
        
        headSales.add(new Employee("Richard", "Sales", 10000));
        headSales.add(new Employee("Rob", "Sales", 10000));
        
        headMkt.add(new Employee("Laura", "Marketing", 10000));
        headMkt.add(new Employee("Bob", "Marketing", 10000));

        System.out.println(ceo);
        
        ceo.getSubordinates().forEach(headEmployee -> {
            System.out.println(headEmployee);
            headEmployee.getSubordinates().forEach(System.out::println);
        });
    }
    
}