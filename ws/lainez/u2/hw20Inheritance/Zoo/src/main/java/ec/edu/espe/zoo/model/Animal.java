/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Ricardo Lainez
 */
public abstract class Animal {
    
    public abstract void feed (int food);
    private int id;
    private Date bornOnDate;
    private Cage cage;
    private char gender;
    private int numberOfLegs;
    protected int region;
    
    
    public void register(int cageId){
        System.out.println(" ");  
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", bornOnDate=" + bornOnDate + ", cage=" + cage + ", gender=" + gender + ", numberOfLegs=" + numberOfLegs + '}';
    }

    public Animal(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        this.id = id;
        this.bornOnDate = bornOnDate;
        this.cage = cage;
        this.gender = gender;
        this.numberOfLegs = numberOfLegs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    
    
    
    
}
