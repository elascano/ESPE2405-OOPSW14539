package ec.edu.espe.motorcycleraura.model;

import java.io.Serializable;



/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */

public class Motorcycle implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private int id;
    private int year; 
    private String brand;
    private String plate;
    private double price;

    public Motorcycle(int id, int year, double price, String brand, String plate) {
        this.id = id;
        this.year = year;
        this.price = price;
        this.brand = brand;
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", year=" + year + ", brand=" + brand + ", plate=" + plate + ", price=" + price +'}';
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
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
     * @return the plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
     
    
}
