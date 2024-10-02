
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassroomManager manager = ClassroomManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command: ");
            String input = scanner.nextLine();
            String[] command = input.split(" ");

            switch (command[0]) {
                case "add_classroom":
                    if (command.length == 2) {
                        manager.addClassroom(command[1]);
                    } else {
                        System.out.println("Usage: add_classroom [className]");
                    }
                    break;

                case "add_student":
                    if (command.length == 3) {
                        manager.addStudent(command[2], command[1]);
                    } else {
                        System.out.println("Usage: add_student [studentID] [className]");
                    }
                    break;

                case "schedule_assignment":
                    if (command.length == 3) {
                        manager.scheduleAssignment(command[1], command[2]);
                    } else {
                        System.out.println("Usage: schedule_assignment [className] [assignmentDetails]");
                    }
                    break;

                case "submit_assignment":
                    if (command.length == 4) {
                        manager.submitAssignment(command[1], command[2], command[3]);
                    } else {
                        System.out.println("Usage: submit_assignment [studentID] [className] [assignmentDetails]");
                    }
                    break;

                case "list_classrooms":
                    manager.listClassrooms();
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
