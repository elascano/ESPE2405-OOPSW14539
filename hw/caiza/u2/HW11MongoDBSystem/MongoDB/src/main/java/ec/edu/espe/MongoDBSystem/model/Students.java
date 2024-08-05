/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MongoDBSystem.model;
import java.util.Date;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class Students {
    private String id;
    private String name;
    private Date bornOnDate;
    private double average;
    private boolean male;
    private int siblings;

    @Override
    public String toString() {
        return "Students{" +
                "id=" +id + '\'' +
                ", name=" + name + '\'' +
                ", bornOnDate=" + bornOnDate + '\'' + 
                ", average=" + average + '\'' +
                ", male=" + male + '\'' + 
                ", siblings="+ siblings + 
                '}';
    }

    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the average
     */
    public double getAverage() {
        return average;
    }

    /**
     * @param average the average to set
     */
    public void setAverage(double average) {
        this.average = average;
    }

    /**
     * @return the male
     */
    public boolean isMale() {
        return male;
    }

    /**
     * @param male the male to set
     */
    public void setMale(boolean male) {
        this.male = male;
    }

    /**
     * @return the siblings
     */
    public int getSiblings() {
        return siblings;
    }

    /**
     * @param siblings the siblings to set
     */
    public void setSiblings(int siblings) {
        this.siblings = siblings;
    }
    
    
}
