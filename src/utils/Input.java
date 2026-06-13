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
            grades[i] = genericDoubleInput("Grade %d: ".formatted(i + 1));
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
            numbers[i] = genericDoubleInput("%s%d: ".formatted(itemLabel, i + 1));
        }

        return numbers;
    }

    // weird thing: we have an outer array double[] containing each a two-dimensional array double[][] (we use one for students+grades and one for weights)
    public double[][][] multipleStudentWeightedAverage() {
        int numStudents = genericPositiveIntInput("How many students? ", Integer.MAX_VALUE);
        int numGrades = genericPositiveIntInput("How many grades per student? ", Integer.MAX_VALUE);

        System.out.println("Sum of weights should be 1:");
        double[] weights = genericDoubleArrayInput(numGrades, "Weight ");

        double[][] studentsGrades = new double[numStudents][numGrades];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Entering grades for Student %d:".formatted(i + 1));
            studentsGrades[i] = genericDoubleArrayInput(numGrades, "Grade ");
        }

        return new double[][][] { studentsGrades, new double[][] { weights } };
    }
}
