package mkr2;

public class Tester extends TeamMember {
    private String[] testingTypes;

    public Tester(String name, int experience, String[] testingTypes) {
        super(name, experience);
        this.testingTypes = testingTypes;
    }

    @Override
    public void work() {
        System.out.println(name + " (Tester) is testing using " + String.join(", ", testingTypes));
    }
}

