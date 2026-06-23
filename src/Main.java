import utils.Input;
import utils.BankAccount;

public class Main {
    public static void main (String[] args) {
        Input input = new Input();
        double initialDeposit = input.limitedAttemptsDoubleInput("Enter initial deposit amount: ", 3);

        BankAccount account = new BankAccount(initialDeposit);

        double withdrawalAmount = input.limitedAttemptsDoubleInput("Enter withdrawal amount: ", 3);

        try {
            double withdrawal = BankAccount.withdraw(account, withdrawalAmount);
            System.out.println("Withdrawal successful. Amount withdrawn: %.2f".formatted(withdrawal));
        } catch (BankAccount.insufficientFunds e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final account balance: %.2f".formatted(account.balance));
        }
    }
}