package optional;

public class Main {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.add(new Product("Laptop", 1200.00));
        catalog.add(new Product("Mouse", 25.50));
        catalog.add(new Product("Keyboard", 45.99));

        printPrice(catalog, "Mouse");
        printPrice(catalog, "Monitor");
    }

    private static void printPrice(Catalog catalog, String name) {
        String result = catalog.findByName(name)
                .map(Product::getPrice)
                .map(price -> "Price: $" + price)
                .orElse("Not found");
        System.out.println(result);
    }
}
