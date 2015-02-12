package structural.composite.employee;

public class HR {
    
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
    }
    
}