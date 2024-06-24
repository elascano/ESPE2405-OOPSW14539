
package ec.edu.espe.savecellphone.model;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class CellPhone {
    private int id;
    private String model;
    private int storage;
    private String brand;

    public CellPhone(int id, String model, int storage, String brand) {
        this.id = id;
        this.model = model;
        this.storage = storage;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "CellPhone{" + "id=" + id + ", model=" + model + ", storage=" + storage + ", brand=" + brand + '}';
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
     * @return the storage
     */
    public int getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(int storage) {
        this.storage = storage;
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
    
    
    
}
