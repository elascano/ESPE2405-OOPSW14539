
package ec.edu.espe.bakerysystemmockup.model;

/**
 *
 * @author Damian Toscano
 */

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private int amount;
    private LocalDate date;

    public Product(int id, String name, BigDecimal price, int amount, LocalDate date) {
        if (id <= 0) throw new IllegalArgumentException("Product ID must be positive");
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Product name cannot be empty");
        if (price == null || price.compareTo(BigDecimal.ZERO) < 0) throw new IllegalArgumentException("The price cannot be negative");
        if (amount < 0) throw new IllegalArgumentException("The quantity cannot be negative");
        if (date == null) throw new IllegalArgumentException("Date cannot be null");

        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String toCSV() {
        return id + "," + name + "," + price + "," + amount + "," + date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
