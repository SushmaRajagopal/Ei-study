
public class MainScheduler {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        ConflictNotifier notifier = new ConflictNotifier();

        // Adding tasks
        Task task1 = TaskFactory.createTask("Morning Exercise", "07:00", "08:00", "High");
        manager.addTask(task1);

        Task task2 = TaskFactory.createTask("Team Meeting", "09:00", "10:00", "Medium");
        manager.addTask(task2);

        // Viewing tasks
        manager.viewTasks();

        // Task conflict notification (example)
        Task conflictingTask = TaskFactory.createTask("Training Session", "09:30", "10:30", "High");
        notifier.notifyConflict(conflictingTask);

        // Remove task and view updated list
        manager.removeTask("Morning Exercise");
        manager.viewTasks();
    }
}
