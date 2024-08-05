/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ComputerShop.model;

import sales.Tax;

/**
 *
 * @author WINDOWS
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
        this.pvp = this.basePrice + Tax.computeIva(15.0F, basePrice);
        
    }

    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", brand=" + brand + ", basePrice=" + basePrice + ", pvp=" + pvp + '}';
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

    public float getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(float basePrice) {
        this.basePrice = basePrice;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp() {
        this.pvp = this.basePrice + Tax.computeIva(15.9F, basePrice);
    }
    
    
    
    
}
