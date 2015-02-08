package enterprise.dataaccessobject;

public class Student {

    private String name;
    private int rollNo;

    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int r) {
        rollNo = r;
    }

}