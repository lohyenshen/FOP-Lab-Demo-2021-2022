package L8.Q2;

public class BankAccount {
    private String name;
    private String ic;
    private int balance;

    public BankAccount(String name, String ic, int balance) {
        this.name = name;
        this.ic = ic;
        this.balance =balance;
    }

    public void deposit( int a) {
        balance += a;
    }

    public void withdraw( int a) {

        // if withdraw amount exceeds balance, cancel transaction
        if (a > balance)
            System.out.printf("Balance=%d, Withdraw=%d, Insufficient Balance!\n", balance, a);
        else
            balance -= a;
    }

    public void displayBalance() {
        System.out.println("Balance = " + this.balance);
    }
}
