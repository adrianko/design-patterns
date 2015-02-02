package dataaccessobject;

public class DAO {

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAOImpl();

        for (Student s : dao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + s.getRollNo() + ", Name : " + s.getName() + " ]");
        }

        //update student
        Student student = dao.getAllStudents().get(0);
        student.setName("Michael");
        dao.updateStudent(student);
        
        //get the student
        dao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }

}