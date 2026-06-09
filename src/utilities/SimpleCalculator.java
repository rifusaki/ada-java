package utilities;
public class SimpleCalculator {
    public static void AverageCalculator () {
        double grade1 = 2.2;
        double w1 = 0.3;
        
        double grade2 = 4.5;
        double w2 = 0.45;
        
        double grade3 = 3.8;
        double w3 = 0.25;
        
        double simpleAvg = (grade1 + grade2 + grade3) / 3;
        double weightedAvg = (grade1*w1) + (grade2*w2) + (grade3*w3);
        
        System.out.println("simple average: %.2f".formatted(simpleAvg));
        System.out.println("weighted average: %.4f".formatted(weightedAvg));
    };
    
    public static void DynamicAverage (double[] grades, double[] weights ) {
        
        double simpleAvg = 0;
        for (double grade : grades) simpleAvg += grade;
        simpleAvg /= grades.length;

        double weightedAvg = 0;
        for (int i = 0; i < grades.length; i++) weightedAvg += grades[i] * weights[i];

        System.out.println("simple average: %.2f".formatted(simpleAvg));
        System.out.println("weighted average: %.4f".formatted(weightedAvg));
    };
}
