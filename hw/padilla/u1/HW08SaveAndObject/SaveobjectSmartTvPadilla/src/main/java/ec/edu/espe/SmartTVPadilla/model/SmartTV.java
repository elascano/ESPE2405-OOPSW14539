
package ec.edu.espe.SmartTVPadilla.model;

import java.io.Serializable;

/**
 * @author Marco Padilla, CodeCrafting Engineers, DCCO-ESPE
 */

public class SmartTV implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String brand;
    private String model;
    private int inches;

    public SmartTV(String brand, String model, int inches) {
        this.brand = brand;
        this.model = model;
        this.inches = inches;
    }

    // Getters y Setters
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

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return "SmartTV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", inches=" + inches +
                '}';
    }
}
