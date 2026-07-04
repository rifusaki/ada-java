package comp;

public class BankAccount {
    private double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public String setBalance(double newBalance) {
        if (newBalance < 0) {
            return "Error: Balance cannot be negative.";
        }
        this.balance = newBalance;
        return "Balance updated successfully.";
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Initial balance: " + account.getBalance());
        account.setBalance(1500.0);
        System.out.println("Balance after setting new balance: " + account.getBalance());
        String result = account.setBalance(-100.0);
        System.out.println(result);
        System.out.println("Final balance: " + account.getBalance());
    }
}