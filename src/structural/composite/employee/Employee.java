package structural.composite.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;
    
    public Employee(String n, String d, int s) {
        name = n;
        dept = d;
        salary = s;
        subordinates = new ArrayList<>();
    }
    
    public void add(Employee e) {
        subordinates.add(e);
    }
    
    public void remove(Employee e) {
        subordinates.remove(e);
    }
    
}