package exam2.catalog;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static ArrayList<Product> getOutOfStockProducts(ArrayList<Product> products) {
        ArrayList<Product> outOfStockProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getStock() <= 0) {
                outOfStockProducts.add(product);
            }
        }

        return outOfStockProducts;
    }

    public static void main(String[] args) {
        ArrayList<Product> ProductList = new ArrayList<>();

        Collections.addAll(ProductList, new Product("platano frito", 150.0, 5), new Product("ramen shoyu", 200.0, 0), new Product("krepe", 120.0, 0));

        System.out.println("\nunsorted:");
        for (Product i : ProductList) {
            System.out.println("%s - %s - %s".formatted(i.getName(), i.getPrice(), i.getStock()));
        }

        Collections.sort(ProductList);

        System.out.println("\nsorted:");
        for (Product i : ProductList) {
            System.out.println("%s - %s - %s".formatted(i.getName(), i.getPrice(), i.getStock()));
        }

        System.out.println("\nout of stock:");
        for (Product i : getOutOfStockProducts(ProductList)) {
            System.out.println(i.getName());
        }

        System.out.println();
    }
}
