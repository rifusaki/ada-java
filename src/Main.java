import utils.Calculators;
import utils.GradeStatus;
import utils.Input;
import utils.Output;

public class Main {
    public static void main (String[] args) {

        Input generalInput = new Input();

        double[][] gradeData = generalInput.getGradeInputs();
        double finalGrade = Calculators.DynamicAverage(gradeData);

        String gradeCategory = Calculators.gradeCategorization(finalGrade);
        double assistanceRate = generalInput.getAssistanceRate();
        GradeStatus outcome = Calculators.assistanceAwareGrading(finalGrade, assistanceRate);

        Output.printAssistanceAwareGrading(finalGrade, gradeCategory, assistanceRate, outcome);

    }

}