package utils;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    // returns a double[][] where index 0 contains grades and 1 contains weights
    public double[][] getGradeInputs() {
        System.out.print("How many grades? ");
        int numGrades = Integer.parseInt(scanner.nextLine());
        double[] grades = new double[numGrades];

        boolean isWeighted;
        while (true) {
            System.out.print("Weighted average? (yes/no): ");
            String weightedInput = scanner.nextLine();

            if (weightedInput.equalsIgnoreCase("yes")) {
                isWeighted = true;
                break;
            }

            if (weightedInput.equalsIgnoreCase("no")) {
                isWeighted = false;
                break;
            }

            System.out.println("Invalid input. Please enter yes or no.");
        }

        for (int i = 0; i < numGrades; i++) {
            grades[i] = genericDoubleInput("Grade " + (i + 1) + ": ");
        }

        if (isWeighted) {
            System.out.println("Sum of weights should be 1:");

            double[] weights = genericDoubleArrayInput(numGrades, "Weight ");
            return new double[][] { grades, weights };
        }

        return new double[][] { grades, null };
    }

    public double getAssistanceRate() {
        while (true) {
            double assistanceRate = genericDoubleInput("Enter assistance rate (0-1): ");
            
            if (assistanceRate >= 0 && assistanceRate <= 1) {
                return assistanceRate;
            }
            
            System.out.println("Invalid input. Please enter a value between 0 and 1.");
        }
    }

    public double genericDoubleInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    public double[] genericDoubleArrayInput(int size, String itemLabel) {
        double[] numbers = new double[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = genericDoubleInput(itemLabel + (i + 1) + ": ");
        }

        return numbers;
    }

    public int genericIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public int genericPositiveIntInput(String prompt, int limit) {
        while (true) {
            int input = genericIntInput(prompt);
            if (input > 0 && input <= limit) {
                return input;
            }
            System.out.println("Invalid input. Please enter a positive integer.");
        }
    }

    public int[] genericIntArrayInput(String prompt) {
        int size = genericPositiveIntInput("Enter array size: ", Integer.MAX_VALUE);
        int[] numbers = new int[size];
        
        System.out.println(prompt);
        
        for (int i = 0; i < size; i++) {
            numbers[i] = genericIntInput("Number %d: ".formatted(i + 1));
        }
        
        return numbers;
    }
}
