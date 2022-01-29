package L10.Q1;

public class ContractStaff extends Employee{

    public ContractStaff(String name, double sales) {
        super(name);
        this.salary = 500 + sales * 0.5;
    }

    @Override
    public void display() {
        System.out.printf("The worker %s working as a contract staff " +
                "has a salary of RM%.2f for this month\n", this.name, this.salary);
    }
}
