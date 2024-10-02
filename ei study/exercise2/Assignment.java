
public class Assignment {
    private String assignmentDetails;
    private String className;
    private String submittedBy;

    public Assignment(String className, String assignmentDetails) {
        this.className = className;
        this.assignmentDetails = assignmentDetails;
        this.submittedBy = null;
    }

    public String getClassName() {
        return className;
    }

    public void submit(String studentID) {
        this.submittedBy = studentID;
    }

    public boolean isSubmitted() {
        return submittedBy != null;
    }

    @Override
    public String toString() {
        return "Assignment: " + assignmentDetails + ", Submitted by: " + (submittedBy != null ? submittedBy : "Not submitted");
    }
}
