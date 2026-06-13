package utils;

public class Output {
    public static void printAverage (double average) {
        System.out.println("Calculated average: %.2f".formatted(average));
    }

    public static void printGradeCategory (double average, String category) {
        System.out.println("Your average is %.2f -> %s".formatted(average, category));
    }

    public static void printAssistanceAwareGrading(double grade, String gradeCategory, double assistanceRate, GradeStatus outcome) {
        switch (outcome) {
            case PASS ->
                System.out.println("You passed with a %.2f (%s) and an assistance rate of %.0f%%".formatted(grade, gradeCategory, assistanceRate * 100));
            case FAIL ->
                System.out.println("You failed due to insufficient assistance (%.0f%%). Your grade was %.2f (%s).".formatted(assistanceRate * 100, grade, gradeCategory));
            case INVALID ->
                System.out.println("You failed due to a low final grade of %.2f and insufficient assistance of %.0f%%.".formatted(grade, assistanceRate * 100));
            default ->
                System.out.println("Invalid: " + outcome);
        }
    }

    public static void printSimpleGrading(double grade, String gradeCategory, GradeStatus outcome) {
        switch (outcome) {
            case PASS ->
                System.out.println("You passed with a %.2f (%s)".formatted(grade, gradeCategory));
            case FAIL ->
                System.out.println("You failed with a %.2f (%s)".formatted(grade, gradeCategory));
            default ->
                System.out.println("Invalid: " + outcome);
        }
    }

    public static void printEvenOddCounter(int[] counts) {
        System.out.println("%d even numbers, %d odd numbers".formatted(counts[0], counts[1]));
    }

    public static void printMultipleStudentsAverages(double[] averages) {
        int studentNumber = 1;
        for (double average : averages) {
            System.out.println("Student %d final grade: %.2f".formatted(studentNumber++, average));
        }
    }
}
