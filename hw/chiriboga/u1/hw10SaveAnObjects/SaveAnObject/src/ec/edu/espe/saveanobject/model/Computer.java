
package ec.edu.espe.saveanobject.model;

import java.io.Serializable;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class Computer implements Serializable {
    private int id;
    private String model;
    private String brand;
    private int Storage;
    private int RAM;

    public Computer(int id, String model, String brand, int Storage, int RAM) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.Storage = Storage;
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", model=" + model + ", brand=" + brand + ", Storage=" + Storage + ", RAM=" + RAM + '}';
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
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
     * @return the Storage
     */
    public int getStorage() {
        return Storage;
    }

    /**
     * @param Storage the Storage to set
     */
    public void setStorage(int Storage) {
        this.Storage = Storage;
    }

    /**
     * @return the RAM
     */
    public int getRAM() {
        return RAM;
    }

    /**
     * @param RAM the RAM to set
     */
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    
    
    
    
    
}
