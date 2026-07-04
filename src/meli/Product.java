package meli;

public class Product {
    private String name;
    private double price;
    private int stock;
    private double discount;

    public Product(String name, double price, int stock, double discount) {

        if (price < 0) { throw new RuntimeException("Price cannot be negative."); }
        if (stock < 0) { throw new RuntimeException("Stock cannot be negative."); }
        if ((discount < 0) || (discount > 1)) { throw new RuntimeException("Discount rate must be between 0 and 1."); }

        this.name = name;
        this.price = price;
        this.stock = stock;
        this.discount = discount;
    }

    public double finalPrice() {
        return this.price * (1 - this.discount);
    }

    public boolean isAvailable() {
        return this.stock > 0;
    }

    public boolean sell(int quantity) {
        if (quantity <= this.stock) {
            this.stock -= quantity;
            return true;
        }
        else {
            return false;
        }
    }

    public void applyExtraDiscount(double extraDiscount) {
        if ((extraDiscount < 0) || (extraDiscount > 1)) { throw new RuntimeException("Discount rate must be between 0 and 1."); }
        
        double totalDiscount = extraDiscount + this.discount;

        if (totalDiscount <= 0.5) {
            this.discount = totalDiscount;
        }
        else {
            throw new RuntimeException("Total discount cannot exceed 0.5 (50%).");
        }
    }

    public void showProductInfo() {
        System.out.println("""
                Product name: %s
                Stock: %d
                Price: $%.2f
                Discount: %.0f%%
                Final price: $%.2f
                """.formatted(this.name, this.stock, this.price, this.discount * 100, this.finalPrice()));
    }
}
