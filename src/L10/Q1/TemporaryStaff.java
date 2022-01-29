package L10.Q1;

public class TemporaryStaff extends Employee{

    public TemporaryStaff(String name, int hour) {
        super(name);
        this.salary = 15 * hour;
    }

    @Override
    public void display() {
        System.out.printf("The worker %s working as a temporary staff " +
                "has a salary of RM%.2f for this month\n", this.name, this.salary);
    }
}
