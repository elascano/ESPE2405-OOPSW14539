package model;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
import java.io.Serializable;

public class BlacioSoda implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String flavor;
    private String brand;
    private double volume;
    private double sugarContent;

    public BlacioSoda(int id, String flavor, String brand, double volume, double sugarContent) {
        this.id = id;
        this.flavor = flavor;
        this.brand = brand;
        this.volume = volume;
        this.sugarContent = sugarContent;
    }

    @Override
    public String toString() {
        return "BlacioSoda{" + "id=" + id + ", flavor=" + flavor + ", brand=" + brand + ", volume=" + volume + ", sugarContent=" + sugarContent + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * @param flavor the flavor to set
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * @return the sugarContent
     */
    public double getSugarContent() {
        return sugarContent;
    }

    /**
     * @param sugarContent the sugarContent to set
     */
    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

}
