package utilities;

import java.util.Scanner;

public class Input {

    // returns a double[][] where index 0 contains grades and 1 contains weights
    public double[][] getGradeInputs() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("How many grades? ");
            int numGrades = Integer.parseInt(scanner.nextLine());
            double[] grades = new double[numGrades];

            System.out.print("Weighted average? (yes/no): ");
            boolean isWeighted = scanner.nextLine().equalsIgnoreCase("yes");

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
    }
}
