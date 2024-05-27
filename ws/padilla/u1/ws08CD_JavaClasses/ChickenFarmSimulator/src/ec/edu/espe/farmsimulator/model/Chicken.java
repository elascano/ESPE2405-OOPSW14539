/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author Adrian Padilla
 */
public class Chicken {
    private int id;
    private String color;
    private String name;
    private int age;
    private boolean molting;
    private Date bornObDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", color=" + color + ", name=" + name + ", age=" + age + ", molting=" + molting + ", bornObDate=" + bornObDate + '}';
    }

    public Chicken(int id, String color, String name, int age, boolean molting, Date bornObDate) {
        this.id = id;
        this.color = color;
        this.name = name;
        this.age = age;
        this.molting = molting;
        this.bornObDate = bornObDate;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the molting
     */
    public boolean isMolting() {
        return molting;
    }

    /**
     * @param molting the molting to set
     */
    public void setMolting(boolean molting) {
        this.molting = molting;
    }

    /**
     * @return the bornObDate
     */
    public Date getBornObDate() {
        return bornObDate;
    }

    /**
     * @param bornObDate the bornObDate to set
     */
    public void setBornObDate(Date bornObDate) {
        this.bornObDate = bornObDate;
    }
    
    
}
