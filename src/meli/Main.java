package meli;

public class Main {
    public static void main(String[] args) {
        Product mimic = new Product("Mimic", 100.0, 10, 0.1);

        System.out.println("");
        mimic.showProductInfo();
        
        mimic.applyExtraDiscount(0.25);
        mimic.sell(7);
        mimic.showProductInfo();
    }
}
