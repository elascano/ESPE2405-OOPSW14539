/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.saveanobject.model;
import java.io.Serializable;
/**
 *
 * @author Yostin Sisalema,Code Master,DCC0-ESPE
 */
public class Clock implements Serializable{
    private int id;
    private String clockType; 
    private String brand;
    private String model;
    private String displayType;

    public Clock(int id, String clockType, String brand, String model, String displayType) {
        this.id = id;
        this.clockType = clockType;
        this.brand = brand;
        this.model = model;
        this.displayType = displayType;
    }

    @Override
    public String toString() {
        return "Clock{" + "id=" + id + ", clockType=" + clockType + ", brand=" + brand + ", model=" + model + ", displayType=" + displayType + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClockType() {
        return clockType;
    }

    public void setClockType(String clockType) {
        this.clockType = clockType;
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

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }
    
}
