/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public abstract class Animal {
    
    private int Id;
    private Date bornOnDate;
    private Cage cage;
    private char gender;
    private int numberOfLegs;

    public Animal(int Id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        this.Id = Id;
        this.bornOnDate = bornOnDate;
        this.cage = cage;
        this.gender = gender;
        this.numberOfLegs = numberOfLegs;
    }
    
    public void Register(int cageId) {
//        System.out.println("Registering an animal in cage --> " + cageId);
        System.out.println("Registering an animal in cage --> " + this.getClass().getName() + " in cage -->" + cageId);
    }

    @Override
    public String toString() {
        return "Animal{" + "Id=" + Id + ", bornOnDate=" + bornOnDate + ", cage=" + cage + ", gender=" + gender + ", numberOfLegs=" + numberOfLegs + '}';
    }
    
    public abstract void feed(int food);

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
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
}
