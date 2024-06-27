
package ec.edu.ec.computershop.modle;
 
/**
 *
 * @author Frank Alvaradom, As-Byte Wizards, DCCO-ESPE
 */
import sales.Tax;
public class Computer {
    int id;
    String brand;
    float pvp;
    float basePrice;

    public Computer(int id, String brand, float basePrice) {
        this.id = id;
        this.brand = brand;
        this.basePrice=basePrice;
        this.pvp =basePrice+Tax.computeIva(15.0F, basePrice) ;
       
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

    public float getPvp() {
        return pvp ;
    }

    public void setPvp() {
        
        
        this.pvp = Tax.computeIva(15.0F, pvp);
    }

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }
    
}
