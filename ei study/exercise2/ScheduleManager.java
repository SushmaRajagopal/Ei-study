
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(String description) {
        tasks.removeIf(task -> task.getDescription().equals(description));
    }

    public void viewTasks() {
        tasks.stream().sorted(Comparator.comparing(Task::getStartTime)).forEach(System.out::println);
    }
}
