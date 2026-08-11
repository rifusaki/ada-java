package exam2.catalog;

public class Product implements Comparable<Product>{
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // spec asked to have several ways to compare
    // even though instructions did not mention
    @Override
    public int compareTo(Product other) {
        int priceComparison = Double.compare(this.price, other.price);
        if (priceComparison != 0) {
            return priceComparison;
        }
        return this.name.compareTo(other.name);
    }
    
    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }
}
