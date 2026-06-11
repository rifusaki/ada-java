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
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = Double.parseDouble(scanner.nextLine());
        }

        if (isWeighted) {
            System.out.println("Sum of weights should be 1:");

            double[] weights = new double[numGrades];
            for (int i = 0; i < numGrades; i++) {
                System.out.print("Weight " + (i + 1) + ": ");
                weights[i] = Double.parseDouble(scanner.nextLine());
            }
            return new double[][] { grades, weights };
        }

        return new double[][] { grades, null };
    }

    public double getAssistanceRate() {
        while (true) {
            System.out.print("Enter assistance rate (0-1): ");
            double assistanceRate = Double.parseDouble(scanner.nextLine());
            
            if (assistanceRate >= 0 && assistanceRate <= 1) {
                return assistanceRate;
            }
            
            System.out.println("Invalid input. Please enter a value between 0 and 1.");
        }
    }
}
