
import java.util.HashMap;
import java.util.Map;

public class ClassroomManager {
    private static ClassroomManager instance;
    private Map<String, Classroom> classrooms;

    private ClassroomManager() {
        classrooms = new HashMap<>();
    }

    public static ClassroomManager getInstance() {
        if (instance == null) {
            instance = new ClassroomManager();
        }
        return instance;
    }

    public void addClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            classrooms.put(className, new Classroom(className));
            System.out.println("Classroom [" + className + "] has been created.");
        } else {
            System.out.println("Classroom [" + className + "] already exists.");
        }
    }

    public void addStudent(String className, String studentID) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addStudent(new Student(studentID));
            System.out.println("Student [" + studentID + "] has been enrolled in [" + className + "].");
        } else {
            System.out.println("Classroom [" + className + "] does not exist.");
        }
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addAssignment(new Assignment(className, assignmentDetails));
            System.out.println("Assignment for [" + className + "] has been scheduled.");
        } else {
            System.out.println("Classroom [" + className + "] does not exist.");
        }
    }

    public void submitAssignment(String studentID, String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            for (Assignment assignment : classroom.getAssignments()) {
                if (assignmentDetails.equals(assignment.getClassName())) {
                    assignment.submit(studentID);
                    System.out.println("Assignment submitted by Student [" + studentID + "] in [" + className + "].");
                    return;
                }
            }
            System.out.println("No assignment found in class [" + className + "] with details [" + assignmentDetails + "].");
        } else {
            System.out.println("Classroom [" + className + "] does not exist.");
        }
    }

    public void listClassrooms() {
        classrooms.values().forEach(System.out::println);
    }
}
