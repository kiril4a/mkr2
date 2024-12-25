package mkr2;

public class Developer extends TeamMember {
    private String[] programmingLanguages;

    public Developer(String name, int experience, String[] programmingLanguages) {
        super(name, experience);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void work() {
        System.out.println(name + " (Developer) is coding using " + String.join(", ", programmingLanguages));
    }
}

