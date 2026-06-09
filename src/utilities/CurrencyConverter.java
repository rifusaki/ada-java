package utilities;

public class CurrencyConverter {

    public static double BatchConverterCOP (double amount, String[] targetCurrency) {
        /** 
            i can't use default parameters in java and i'm too lazy to learn overloading
            usage: CurrencyConverter.BatchConverterCOP(1000000, new String[]{"USD", "EUR", "BRL"});
        */
        double convertedAmount = -1;

        // per request: constant exchange rates (updated 2/Jun)
        final double COP_USD = 0.00028132;
        final double COP_EUR = 0.00024166;
        final double COP_BRL = 0.00141551;

        for (String currency : targetCurrency) {
            switch (currency) {
                case "USD" -> convertedAmount = amount * COP_USD;
                case "EUR" -> convertedAmount = amount * COP_EUR;
                case "BRL" -> convertedAmount = amount * COP_BRL;
                default -> System.out.println("Currency not supported");
            }
            System.out.println("Converted amount in %s: %.2f".formatted(currency, convertedAmount));
        }
        return convertedAmount;
    };
}
