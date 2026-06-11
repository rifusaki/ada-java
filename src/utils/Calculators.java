package utils;

public class Calculators {
    
    public static double DynamicAverage (double[][] data) {
        double[] grades = data[0];
        double[] weights = data.length > 1 ? data[1] : null;
        
        if (weights == null) {
            double simpleAvg = 0;
            for (double grade : grades) simpleAvg += grade;
            return simpleAvg / grades.length;
        } else {
            double weightedAvg = 0;
            for (int i = 0; i < grades.length; i++) weightedAvg += grades[i] * weights[i];
            return weightedAvg;
        }
    }

    public static String gradeCategorization(double grade) {
        String category =
                grade > 5.0 || grade < 0.0 ? "Invalid grade" :
                grade >= 4.5 ? "Excellent" :
                grade >= 3.5 ? "Good" :
                grade >= 3.0 ? "Pass" :
                "Fail";

        return category;
    }

    public static String assistanceAwareGrading(double grade, double assistanceRate) {
        if (grade >= 3.0 && assistanceRate >= 0.75) return "passed";
        else if (grade >= 3.0) return "failed_assistance";
        else if (assistanceRate >= 0.75) return "failed_grade";
        else return "failed_both";
    }

    public static double ComputeArea (double length, double width) {
        return length * width;
    }
}
