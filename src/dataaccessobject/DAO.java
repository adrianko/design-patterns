package dataaccessobject;

public class DAO {

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAOImpl();

        for (Student s : dao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + s.getRollNo() + ", Name : " + s.getName() + " ]");
        }
    }

}