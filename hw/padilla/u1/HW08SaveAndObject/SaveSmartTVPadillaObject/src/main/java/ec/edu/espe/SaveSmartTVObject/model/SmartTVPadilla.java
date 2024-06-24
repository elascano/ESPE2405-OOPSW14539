
package ec.edu.espe.SaveSmartTVObject.model;

import java.io.Serializable;

/**
 *
 * @author Marco Padilla, CodeCrafting Engineers, DCCO-ESPE
 */
public class SmartTVPadilla implements Serializable {

    private int id;
    private String brand;
    private String model;
    private float price;
    private boolean isSmart;

    @Override
    public String toString() {
        return "SmartTVPadilla{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", isSmart=" + isSmart + '}';
    }

    public SmartTVPadilla(int id, String brand, String model, float price, boolean isSmart) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.isSmart = isSmart;
    }

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isIsSmart() {
        return isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }
}
