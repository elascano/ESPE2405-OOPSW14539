
package ec.edu.espe.bakerysystemmockup.model;

/**
 *
 * @author adria
 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Product> products;

    public Stock() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("The product cannot be null");
        }
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product findProductById(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public int getTotalQuantity() {
        return products.stream().mapToInt(Product::getAmount).sum();
    }

    public BigDecimal getTotalValue() {
        return products.stream()
                .map(product -> product.getPrice().multiply(BigDecimal.valueOf(product.getAmount())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "products=" + products +
                '}';
    }
}
