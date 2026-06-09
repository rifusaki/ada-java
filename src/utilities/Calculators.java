package utilities;

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
    };

    public static double ComputeArea (double length, double width) {
        return length * width;
    };
}
