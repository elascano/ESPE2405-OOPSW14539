/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.es.mongoDB.modell;

/**
 *
 * @author CODE_CRAFTING_ENGINEERS
 */
public class Car {
    private int id;
    private String model;
    private String color;
    private String saleDate;

    public Car() {
    }

    
    public Car(int id, String model, String color, String saleDate) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.saleDate = saleDate;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", model=" + model + ", color=" + color + ", saleDate=" + saleDate + '}';
    }
    
}
