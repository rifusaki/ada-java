package miniatm;

public class BankAccount {

    public double balance;

    public BankAccount(double amount) {
        this.balance = amount;
    }

    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    public static void deposit(BankAccount account, double amount) {
        account.balance += amount;
    }

    public static double withdraw(BankAccount account, double amount) throws InsufficientFundsException {
        if (amount > account.balance) {
            throw new InsufficientFundsException(
                "Error: Insufficient balance. Current balance is %.2f, attempted to withdraw %.2f."
                    .formatted(account.balance, amount)
            );
        }

        account.balance -= amount;

        return amount;
    }
}
