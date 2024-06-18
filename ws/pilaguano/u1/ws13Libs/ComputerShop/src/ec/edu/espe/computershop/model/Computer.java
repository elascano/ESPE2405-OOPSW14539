
package ec.edu.espe.computershop.model;

import sales.Tax;

/**
 *
 * @author DavidPilaguano, Lenovo , DDCC
 */
public class Computer {
    private int id;
    private String brand;
    private float basePrice;
    private float pvp;

    public Computer(int id, String brand, float basePrice) {
        this.id = id;
        this.brand = brand;
        this.basePrice = basePrice;
        this.pvp = basePrice+Tax.computerIva(15.0F, basePrice);
    }

    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", brand=" + brand + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
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
     * @return the basePrice
     */
    public float getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * @return the pvp
     */
    public float getPvp() {
        return pvp;
    }

    /**
     * @param pvp the pvp to set according to the ivaPercentage
     */
//    public void setPvp() {
//        this.pvp = this.basePrice + Tax.computeIva(ivaPercentage(15.0F), basePrice);
//    }
//    
    
    
}
