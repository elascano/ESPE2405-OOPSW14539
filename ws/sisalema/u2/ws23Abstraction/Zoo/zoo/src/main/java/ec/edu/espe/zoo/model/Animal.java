/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Yostin Sisalema,Code Master,DCCO-ESPE
 */
public class Animal {
    private int id;
    private String description;
    private Date date;
    private String gender;
    private String cage;
    private int numberOfBones;
    private boolean isVertebrate;
    
    private ArrayList<String> foods;

    public Animal(int id, String description, Date date, String gender, String cage, int numberOfBones, boolean isVertebrate, ArrayList<String> foods) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.gender = gender;
        this.cage = cage;
        this.numberOfBones = numberOfBones;
        this.isVertebrate = isVertebrate;
        this.foods = foods;
    } 

    public boolean getIsVertebrate() {
        return isVertebrate;
    }

    public void setIsVertebrate(boolean isVertebrate) {
        this.isVertebrate = isVertebrate;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the cage
     */
    public String getCage() {
        return cage;
    }

    /**
     * @param cage the cage to set
     */
    public void setCage(String cage) {
        this.cage = cage;
    }

    /**
     * @return the numberOfBones
     */
    public int getNumberOfBones() {
        return numberOfBones;
    }

    /**
     * @param numberOfBones the numberOfBones to set
     */
    public void setNumberOfBones(int numberOfBones) {
        this.numberOfBones = numberOfBones;
    }


    /**
     * @return the foods
     */
    public ArrayList<String> getFoods() {
        return foods;
    }

    /**
     * @param foods the foods to set
     */
    public void setFoods(ArrayList<String> foods) {
        this.foods = foods;
    } 
    
}