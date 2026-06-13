package archive;

public class HelloWorld {
    
    // why hello world when you can izutsumi
    System.out.println("\nizutsumi world\n"); // from dunmeshi

    // variables and etc
    int definitelyNotTheNumberTwo = 2; // source: i made it up
    double theFullLenghtOfPi = 3.1415926535897932384626433832795; // i love my numbers truncated
    boolean isMyCatSleeping = true; // eepy cat
    char alejandroChar = 'L'; // common Char L
    String blorbo = "izutsumi but as a blorbo\n"; // i love izutsumi she is my blorbo

    // (don't do this)
    Object[] vars = {definitelyNotTheNumberTwo, theFullLenghtOfPi, isMyCatSleeping, alejandroChar, blorbo};
    for (Object var : vars) System.out.println(var);

    /**
    double[][] gradeData = generalInput.getGradeInputs();
    double finalGrade = Calculators.DynamicAverage(gradeData);

    String gradeCategory = Calculators.gradeCategorization(finalGrade);
    double assistanceRate = generalInput.getAssistanceRate();
    GradeStatus outcome = Calculators.assistanceAwareGrading(finalGrade, assistanceRate);

    Output.printAssistanceAwareGrading(finalGrade, gradeCategory, assistanceRate, outcome);
    */

    // int limit = generalInput.genericPositiveIntInput("Enter limit for multiples of 5: ");
    // Loops.highlightMultiplesOfFive(limit);

    // Loops.randomNumberGuessing();

            int[] intArray = {1, 2, 3};

        System.out.println(intArray.length);

        // Input generalInput = new Input();
        // int[] intArray = generalInput.genericIntArrayInput("Enter numbers: ");

        // int[] counts = Misc.evenOddCounter(intArray);
        
        // Output.printEvenOddCounter(counts);

}
