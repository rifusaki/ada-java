package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Catalog {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Optional<Product> findByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
