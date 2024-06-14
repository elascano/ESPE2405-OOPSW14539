/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.computersshop.model;

/**
 *
 * @author G400
 */
public class Computer {
    private int id;
    private String brand;
    private float baseprice;
    private float pvp;

    public Computer(int id, String brand, float baseprice) {
        this.id = id;
        this.brand = brand;
        this.baseprice = basePrice;
        this .pvp = this.baseprice +Tax.computeIva(15.0F, baseprice);
       
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
     * @return the baseprice
     */
    public float getBaseprice() {
        return baseprice;
    }

    /**
     * @param baseprice the baseprice to set
     */
    public void setBaseprice(float baseprice) {
        this.baseprice = baseprice;
    }

    /**
     * @return the pvp
     */
    public float getPvp() {
        return pvp;
    }

    /**
     * @param pvp the pvp to set according to the ivaPERCENTAGE
     */
    public void setPvp() {
        this.pvp = this.baseprice + Tax.computerIva();
    }
    
}
