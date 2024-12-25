package mkr2;

public class Task implements Observer {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public void update(String status) {
        System.out.println("Task \"" + taskName + "\" status updated to: " + status);
    }
}


