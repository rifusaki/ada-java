package agenda;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public int genericIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid integer.");
            }
        }
    }

    public int genericPositiveIntInput(String prompt) {
        while (true) {
            int value = genericIntInput(prompt);

            if (value > 0) {
                return value;
            }

            System.out.println("Error: Please enter a positive integer.");
        }
    }

    public String genericStringInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println("Error: Please enter a non-empty value.");
        }
    }

    public boolean genericBooleanInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine().trim();

            if (value.equalsIgnoreCase("yes") || value.equalsIgnoreCase("y")) {
                return true;
            }

            if (value.equalsIgnoreCase("no") || value.equalsIgnoreCase("n")) {
                return false;
            }

            System.out.println("Error: Please enter yes or no.");
        }
    }

    public void close() {
        scanner.close();
    }
}
