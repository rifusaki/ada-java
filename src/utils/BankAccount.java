package utils;

public class BankAccount {

    public double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public static class insufficientFunds extends Exception {
        public insufficientFunds(String message) {
            super(message);
        }
    }

    public static double withdraw(BankAccount account, double amount) throws insufficientFunds {
        if (amount > account.balance) {
            throw new insufficientFunds("Withdrawal amount exceeds available balance.");
        }

        account.balance -= amount;

        return amount;
    }
}
