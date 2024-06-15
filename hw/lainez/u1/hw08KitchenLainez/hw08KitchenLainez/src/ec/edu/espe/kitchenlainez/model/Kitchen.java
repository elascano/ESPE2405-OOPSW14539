/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.kitchenlainez.model;

import java.io.Serializable;

/**
 *
 * @author WINDOWS
 */
public class Kitchen implements Serializable{
    private int id;
    private int numberOfSprockets;
    private String brand;
    private String size;
    private String color;

    public Kitchen(int id, int numberOfSprockets, String brand, String size, String color) {
        this.id = id;
        this.numberOfSprockets = numberOfSprockets;
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Kitchen{" + "id=" + id + ", numberOfSprockets=" + numberOfSprockets + ", brand=" + brand + ", size=" + size + ", color=" + color + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfSprockets() {
        return numberOfSprockets;
    }

    public void setNumberOfSprockets(int numberOfSprockets) {
        this.numberOfSprockets = numberOfSprockets;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
