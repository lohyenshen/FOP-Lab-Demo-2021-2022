package L10.Q1;

public class Test_Q1 {
    public static void main(String[] args) {
        Employee worker1 = new PermanentEmployee("A", 'B');
        Employee worker2 = new ContractStaff("B", 1000);
        Employee worker3 = new TemporaryStaff("C", 10);
        worker1.display();
        worker2.display();
        worker3.display();
    }
}
