package mkr2;

public class ProjectManager extends TeamMember {
    public ProjectManager(String name, int experience) {
        super(name, experience);
    }

    @Override
    public void work() {
        System.out.println(name + " (PM) is managing the project.");
    }
}

