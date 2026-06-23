package miniatm;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();

        double initialDeposit = input.genericDoubleInput("Enter initial deposit: ");
        BankAccount account = new BankAccount(initialDeposit);
        System.out.println("Account created with balance: %.2f".formatted(account.balance));

        while (true) {
            try {
                System.out.println("\nMenu");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Exit");

                int option = input.genericIntInput("Choose an option: ");

                if (option == 3) {
                    System.out.println(
                        "Thank you for using the Mini-ATM. Final balance: %.2f"
                            .formatted(account.balance)
                    );
                    break;
                }

                if (option != 1 && option != 2) {
                    System.out.println("Invalid option. Try again.");
                    continue;
                }

                double amount = input.genericDoubleInput("Enter amount: ");

                if (option == 1) {
                    BankAccount.deposit(account, amount);
                    System.out.println(
                        "Deposit successful. New balance: %.2f"
                            .formatted(account.balance)
                    );
                } else {
                    double withdrawn = BankAccount.withdraw(account, amount);
                    System.out.println(
                        "Withdrawal successful. Amount withdrawn: %.2f"
                            .formatted(withdrawn)
                    );
                }
            } catch (BankAccount.InsufficientFundsException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
                break;
            }
        }

        input.close();
    }
}
