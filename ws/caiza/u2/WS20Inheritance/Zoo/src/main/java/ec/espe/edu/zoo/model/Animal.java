/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.zoo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public abstract class Animal {
    private int id;
    private Date bornOnDate;
    private Cage cage;
    private char gender;
    private int numberOfLegs;
    private float length;
    private boolean vertebrate;
    private float weight;
    private boolean depredator;

    public Animal(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs, float length, boolean vertebrate, float weight, boolean depredator) {
        this.id = id;
        this.bornOnDate = bornOnDate;
        this.cage = cage;
        this.gender = gender;
        this.numberOfLegs = numberOfLegs;
        this.length = length;
        this.vertebrate = vertebrate;
        this.weight = weight;
        this.depredator = depredator;
    }



    public abstract void register(Cage cage);
    public abstract void feed();
    public abstract void receiveVaccine(ArrayList<Vaccine> vaccines);

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
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    /**
     * @return the cage
     */
    public Cage getCage() {
        return cage;
    }

    /**
     * @param cage the cage to set
     */
    public void setCage(Cage cage) {
        this.cage = cage;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the numberOfLegs
     */
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    /**
     * @param numberOfLegs the numberOfLegs to set
     */
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     * @return the vertebrate
     */
    public boolean isVertebrate() {
        return vertebrate;
    }

    /**
     * @param vertebrate the vertebrate to set
     */
    public void setVertebrate(boolean vertebrate) {
        this.vertebrate = vertebrate;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the depredator
     */
    public boolean isDepredator() {
        return depredator;
    }

    /**
     * @param depredator the depredator to set
     */
    public void setDepredator(boolean depredator) {
        this.depredator = depredator;
    }
}
