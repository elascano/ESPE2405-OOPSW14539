package ec.edu.espe.SaveAndObject.model;

import java.io.Serializable;

/**
 *
 * @author Kenned Sigcha, PPS
 */
public class Cellphone implements Serializable {

    private int id;
    private String brand;
    private String model;
    private double price;
    private boolean is5G;

    @Override
    public String toString() {
        return "Cellphone{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", is5G=" + is5G + '}';
    }

    public Cellphone(int id, String brand, String model, double price, boolean is5G) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.is5G = is5G;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIs5G() {
        return is5G;
    }

    public void setIs5G(boolean is5G) {
        this.is5G = is5G;
    }
}
