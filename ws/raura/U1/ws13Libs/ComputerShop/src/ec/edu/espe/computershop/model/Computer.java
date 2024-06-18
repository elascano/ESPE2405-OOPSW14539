package ec.edu.espe.computershop.model;

import sales.Tax;
/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class Computer {
    private int Id;
    private String brand;
    private float basePrice;
    private float pvp;

    public Computer(int Id, String brand, float basePrice) {
        this.Id = Id;
        this.brand = brand;
        this.basePrice = basePrice;
        this.pvp = basePrice + Tax.computeIva(15.0F,basePrice);
    }

    @Override
    public String toString() {
        return "Computer{" + "Id=" + Id + ", brand=" + brand + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
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
     * @param pvp the pvp to set
     */
    public void setPvp(float pvp) {
        this.pvp = this.basePrice + sales.Tax.computeIva(15.0F,basePrice);
    }
    
    
}
