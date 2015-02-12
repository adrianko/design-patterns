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
        Employee headMkt = new Employee("Michael", "Head or Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
        
        ceo.add(headSales);
        ceo.add(headMkt);
        
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);
        
        headMkt.add(clerk1);
        headMkt.add(clerk2);

        System.out.println(ceo);
        
        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);
            
            headEmployee.getSubordinates().forEach(System.out::println);
        }
    }
    
}