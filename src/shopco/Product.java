package shopco;

public class Product {
    
    private String name;
    private double price;
    private int    stock;
    private String category;

    // constructors
    public Product() {
        this.name = "Unnamed";
        this.price = 0.0;
        this.stock = 0;
        this.category = "Uncategorized";
    }

    public Product(String name, double price, int stock, String category) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public Product(Product parent) {
        this.name = parent.name;
        this.price = parent.price;
        this.stock = parent.stock;
        this.category = parent.category;
    }

    // methods
    public void show() {
        System.out.println("""
            -- Product
            Name:       %s
            Price:      $%.1f
            Stock:      %d units
            Category:   %s
            """.formatted(name, price, stock, category));
    }

    @Override
    public String toString() {
        return "%s | $%.1f".formatted(name, price);
    }

    // getters
    public double getPrice() {
        return price;
    }
}
