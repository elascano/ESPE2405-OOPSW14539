/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.car.model;

/**
 *
 * @author CODE_CRAFTING_ENGINEERS
 */
public class Car {
    private int id;
    private String model;
    private String plate;
    private String color;
    private double price;

    public Car(int id, String model, String plate, String color, double price) {
        this.id = id;
        this.model = model;
        this.plate = plate;
        this.color = color;
        this.price = price;
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

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\nModel: " + model + "\nPlate: " + plate + "\nColor: " + color + "\nPrice=" + price ;
    }
    
    
}
