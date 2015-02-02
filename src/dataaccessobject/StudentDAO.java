package dataaccessobject;

import java.util.List;

public interface StudentDAO {

    public List<Student> getAllStudents();
    public Student getStudent(int rn);
    public void updateStudent(Student s);
    public void deleteStudent(Student s);

}
