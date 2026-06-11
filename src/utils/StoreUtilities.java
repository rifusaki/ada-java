package utils;

public class StoreUtilities {
    private static final double vatRate = 0.19; // 19% VAT rate

    public static double calculateVAT(double price) {
        return price * vatRate;
    }

    public static double calculatePriceWithVAT(double price) {
        return price + calculateVAT(price);
    }

    public static double computeDiscount(double price, double discountRate) {
        return price * discountRate;
    }
}
