import utils.Calculators;
import utils.Input;
import utils.Output;

public class Main {
    public static void main (String[] args) {

    Input generalInput = new Input();

    double[][][] inputData = generalInput.multipleStudentWeightedAverage();
    double[] finalAverages = Calculators.multipleDynamicAverage(inputData);
    Output.printMultipleStudentsAverages(finalAverages);

    }

}
