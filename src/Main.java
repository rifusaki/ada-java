import utilities.Calculators;
import utilities.Input;
import utilities.Output;
import utilities.StoreUtilities;

public class Main {
    public static void main (String[] args) {
        
        // avgs
        Calculators.DynamicAverage(new double[][]{{2.2, 4.5, 3.8}, {0.3, 0.45, 0.25}});

        Input avgInput = new Input();
        double[][] gradeData = avgInput.getGradeInputs();
        double result = Calculators.DynamicAverage(gradeData);
        Output.printAverage(result);

        // sample store utils
        double price = 100.0;
        double priceWithVAT = StoreUtilities.calculatePriceWithVAT(price);
        double discount = StoreUtilities.computeDiscount(price, 0.1); // 10%
        System.out.println("Price with VAT: %.2f".formatted(priceWithVAT)); 
        System.out.println("Discount amount: %.2f".formatted(discount));
        
    };

}