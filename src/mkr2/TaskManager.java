package mkr2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Observer> tasks = new ArrayList<>();

    public void addTask(Observer task) {
        tasks.add(task);
        System.out.println("Task added: " + ((Task) task).getTaskName());
    }

    public void updateTaskStatus(String status) {
        for (Observer task : tasks) {
            task.update(status);
        }
    }
}


