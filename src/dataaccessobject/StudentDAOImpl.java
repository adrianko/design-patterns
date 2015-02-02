package dataaccessobject;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    List<Student> students;

    public StudentDAOImpl() {
        students = new ArrayList<>();
        Student s1 = new Student("Robert", 0);
        Student s2 = new Student("John", 1);
        students.add(s1);
        students.add(s2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rn) {
        return students.get(rn);
    }

    @Override
    public void updateStudent(Student s) {
        students.get(s.getRollNo()).setName(s.getName());
        System.out.println("Student: Roll No " + s.getRollNo() + ", updated in the database");
    }

    @Override
    public void deleteStudent(Student s) {
        students.remove(s.getRollNo());
        System.out.println("Student: Roll No " + s.getRollNo() + ", deleted from database");
    }

}