/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author heiso
 */
public abstract class Animal {
    private int id;
    private Date bornOnDate;
    private Cage cage;
    private char gerder;
    private int numberOfLegh;

    @Override
    public String toString() {
        return "Animal{" + "id=" + getId() + ", bornOnDate=" + getBornOnDate() + ", cage=" + getCage() + ", gerder=" + getGerder() + ", numberOfLegh=" + getNumberOfLegh() + '}';
    }

    public Animal(int id, Date bornOnDate, Cage cage, char gerder, int numberOfLegh) {
        this.id = id;
        this.bornOnDate = bornOnDate;
        this.cage = cage;
        this.gerder = gerder;
        this.numberOfLegh = numberOfLegh;
    }
       
    
    public abstract void food(int food);
        public void register(int cageId){
            System.out.println("Registen an animal"+this.getClass().getSimpleName()+" in the cage-->"+cageId);
    
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
     * @return the gerder
     */
    public char getGerder() {
        return gerder;
    }

    /**
     * @param gerder the gerder to set
     */
    public void setGerder(char gerder) {
        this.gerder = gerder;
    }

    /**
     * @return the numberOfLegh
     */
    public int getNumberOfLegh() {
        return numberOfLegh;
    }

    /**
     * @param numberOfLegh the numberOfLegh to set
     */
    public void setNumberOfLegh(int numberOfLegh) {
        this.numberOfLegh = numberOfLegh;
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
    
    
    
}
