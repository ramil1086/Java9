import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class main {
    public static void main(String[] args) {

        StudentDao sd = new StudentDao();
        Session session = sd.openCurrentSession();
        for (int i = 0; i < 10; i++) {
            sd.save(new Student("name" + i, "Faculty" + i));
        }

        List<Student> students = sd.findAll();
        for (Student s : students) {
            System.out.println(s.toString());
        }
        Student student = sd.findById(2L);
        System.out.println("Found Student: " + student.toString());

        sd.delete(student);
        sd.closeCurrentSessionWithTransaction();

    }
}
