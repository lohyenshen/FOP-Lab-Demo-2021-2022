package L10.Q1;

public class PermanentEmployee extends Employee{

    public PermanentEmployee(String name, char category) {
        super(name);
        if (category == 'A') {
            this.salary = 4000;
        }
        else if (category == 'B') {
            this.salary = 3000;
        }
        else if (category == 'C') {
            this.salary = 2000;
        }
        else{
            this.salary = 0;
        }
    }

    @Override
    public void display() {
        System.out.printf("The worker %s working as a permanent employee " +
                "has a salary of RM%.2f for this month\n", this.name, this.salary);
    }
}
