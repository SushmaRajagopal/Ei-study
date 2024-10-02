
public class ConflictNotifier implements ConflictObserver {
    @Override
    public void notifyConflict(Task task) {
        System.out.println("Task conflict detected: " + task.getDescription());
    }
}
