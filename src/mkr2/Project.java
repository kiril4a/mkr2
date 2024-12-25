package mkr2;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<TeamMember> teamMembers = new ArrayList<>();

    public void addTeamMember(TeamMember member) {
        teamMembers.add(member);
        System.out.println(member.name + " joined the project.");
    }

    public void assignTask(String task) {
        System.out.println("New task assigned: " + task);
        notifyTeam(task);
    }

    private void notifyTeam(String task) {
        for (TeamMember member : teamMembers) {
            System.out.println(member.name + " is notified about the task: " + task);
        }
    }
}

