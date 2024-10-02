
public class Student {
    private String studentID;

    public Student(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID;
    }
}
