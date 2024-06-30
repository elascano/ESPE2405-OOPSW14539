package ec.edu.espe.SaveAndObject.model;

import java.io.Serializable;

/**
 *
 * @author [Tu Nombre]
 */
public class Doll implements Serializable {

    private int id;
    private String name;
    private String material;
    private double price;
    private boolean isCollectible;

    @Override
    public String toString() {
        return "Doll{" + "id=" + id + ", name=" + name + ", material=" + material + ", price=" + price + ", isCollectible=" + isCollectible + '}';
    }

    public Doll(int id, String name, String material, double price, boolean isCollectible) {
        this.id = id;
        this.name = name;
        this.material = material;
        this.price = price;
        this.isCollectible = isCollectible;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIsCollectible() {
        return isCollectible;
    }

    public void setIsCollectible(boolean isCollectible) {
        this.isCollectible = isCollectible;
    }
}
