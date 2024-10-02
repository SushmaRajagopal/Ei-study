
import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String className;
    private List<Student> students;
    private List<Assignment> assignments;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    @Override
    public String toString() {
        return "Classroom: " + className + ", Students: " + students.size() + ", Assignments: " + assignments.size();
    }
}
