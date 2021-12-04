import java.util.*;

public class StudentReg {

    private Set<Student> studentReg = new HashSet<>();

    public Set<Student> getStudents() {
        return studentReg;
    }

    public boolean addStudent(Student student) {
        if (studentReg.contains(student)) {
            return false;
        } else {
            studentReg.add(student);
            return true;
        }

    }
}
