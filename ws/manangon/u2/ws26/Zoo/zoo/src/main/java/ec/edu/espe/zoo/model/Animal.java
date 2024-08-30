/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author IAEN
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public int getNumberOfBones() {
        return numberOfBones;
    }

    public void setNumberOfBones(int numberOfBones) {
        this.numberOfBones = numberOfBones;
    }

      public boolean getIsVertebrate() {
        return isVertebrate;
    }


    public void setIsVertebrate(boolean isVertebrate) {
        this.isVertebrate = isVertebrate;
    }

    public ArrayList<String> getFoods() {
        return foods;
    }

    public void setFoods(ArrayList<String> foods) {
        this.foods = foods;
    }

}
    
    