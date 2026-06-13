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

    public static GradeStatus simpleGrading(double grade) {
        if (grade >= 3.0) return GradeStatus.PASS;
        else if (grade >= 0.0) return GradeStatus.FAIL;
        else return GradeStatus.INVALID;
    }

    public static GradeStatus assistanceAwareGrading(double grade, double assistanceRate) {
        if (grade >= 3.0 && assistanceRate >= 0.75) return GradeStatus.PASS;
        else if (grade >= 3.0) return GradeStatus.FAIL;
        else if (assistanceRate >= 0.75) return GradeStatus.FAIL;
        else return GradeStatus.INVALID;
    }

    public static double ComputeArea (double length, double width) {
        return length * width;
    }

    public static double[] multipleDynamicAverage(double[][][] inputData) {
        double[][] studentsGrades = inputData[0];
        double[] weights = inputData[1][0];
        
        double[] finalAverages = new double[studentsGrades.length];
        
        for (int i = 0; i < studentsGrades.length; i++) {
            finalAverages[i] = DynamicAverage(new double[][] { studentsGrades[i], weights });
        }
        return finalAverages;
    }
}
