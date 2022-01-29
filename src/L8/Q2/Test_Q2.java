package L8.Q2;

public class Test_Q2 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Shawn", "011122334455", 1000);
        account1.displayBalance();

        account1.deposit(500);
        account1.displayBalance();

        account1.withdraw(1300);
        account1.displayBalance();

        account1.withdraw(300);
        account1.displayBalance();
    }
}
