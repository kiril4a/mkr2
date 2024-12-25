package mkr2;

public class TeamMemberFactory {
    public static TeamMember createTeamMember(String role, String name, int experience, String[] details) {
        return switch (role.toLowerCase()) {
            case "developer" -> new Developer(name, experience, details);
            case "tester" -> new Tester(name, experience, details);
            case "pm" -> new ProjectManager(name, experience);
            default -> throw new IllegalArgumentException("Unknown role: " + role);
        };
    }
}

