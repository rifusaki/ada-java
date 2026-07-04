package comp;

public class VATCalc {

    public static double vatCalculator(double[] input) {
        switch (input[1]) {
            case 1.0:
                return Math.round(input[0] * (1.07) * 10000.0) / 10000.0;
            case 2.0:
                return Math.round(input[0] * (1.12) * 10000.0) / 10000.0;
            case 3.0:
                return Math.round(input[0] * (1.15) * 10000.0) / 10000.0;
            default:
                return -1.0;
        }
    }

public static void main(String[] args) {
    double[][] testCases = {{250.10, 1.0}, {220.5, 3.0}, {100.2, 3.5}};
    int index = 1;
        for (double[] testCase : testCases) {
            System.out.println("Input: [%.2f, %.2f], Price for case %d: %.4f".formatted(testCase[0], testCase[1], index, vatCalculator(testCase)));
      index++;
    }

    }
}
