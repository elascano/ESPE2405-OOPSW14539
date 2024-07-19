/*
e * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.saveanobject.model;
import java.io.Serializable;
/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class Toy implements Serializable{
    private int id;
    private String type;
    private String brand;
    private String material;
    private boolean batteryRequired;

    public Toy(int id, String type, String brand, String material, boolean batteryRequired) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.material = material;
        this.batteryRequired = batteryRequired;
    }

    @Override
    public String toString() {
        return "Toy{" + "id=" + id + ", type=" + type + ", brand=" + brand + ", material=" + material + ", batteryRequired=" + batteryRequired + '}';
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the batteryRequired
     */
    public boolean isBatteryRequired() {
        return batteryRequired;
    }

    /**
     * @param batteryRequired the batteryRequired to set
     */
    public void setBatteryRequired(boolean batteryRequired) {
        this.batteryRequired = batteryRequired;
    }
    
}
