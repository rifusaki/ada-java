import utilities.CurrencyConverter;
import utilities.SimpleCalculator;

public class Main {
    public static void main (String[] args) {
        
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
        
        // avgs
        SimpleCalculator.AverageCalculator();
        SimpleCalculator.DynamicAverage(new double[]{2.2, 4.5, 3.8}, new double[]{0.3, 0.45, 0.25});
        SimpleCalculator.DynamicAverage(new double[]{2.2, 4.5, 3.8, 4.9}, new double[]{0.1, 0.45, 0.25, 0.3});

        // currency
        CurrencyConverter.BatchConverterCOP(1000000, new String[]{"USD", "EUR", "BRL"});
    };

}