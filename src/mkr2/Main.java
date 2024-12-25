package mkr2;

public class Main {
    public static void main(String[] args) {
        // 1. Створення членів команди
        TeamMember dev = TeamMemberFactory.createTeamMember("developer", "Alice", 5, new String[]{"Java", "Python"});
        TeamMember tester = TeamMemberFactory.createTeamMember("tester", "Bob", 3, new String[]{"Manual Testing", "Automation"});
        TeamMember pm = TeamMemberFactory.createTeamMember("pm", "Charlie", 8, null);

        // 2. Управління проектом (Медіатор)
        Project project = new Project();
        project.addTeamMember(dev);
        project.addTeamMember(tester);
        project.addTeamMember(pm);

        project.assignTask("Build a new feature");

        // 3. Спостерігач за статусом задач
        TaskManager taskManager = new TaskManager();
        Task task1 = new Task("Develop Feature A");
        Task task2 = new Task("Test Feature A");

        taskManager.addTask(task1);
        taskManager.addTask(task2);

        taskManager.updateTaskStatus("In Progress");
        taskManager.updateTaskStatus("Completed");
    }
}
