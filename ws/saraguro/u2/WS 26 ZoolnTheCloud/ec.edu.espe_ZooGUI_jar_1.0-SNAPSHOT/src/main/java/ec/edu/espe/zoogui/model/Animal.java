
package ec.edu.espe.zoogui.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class Animal {
    private int Id;
    private String description;
    private Date date;
    private String gender;
    private String cage;
    private int numberOfBones;
    private boolean isVertrebrate;
    private ArrayList<String> foods;

    public Animal(int Id, String description, Date date, String gender, String cage, int numberOfBones, boolean isVertrebrate, ArrayList<String> foods) {
        this.Id = Id;
        this.description = description;
        this.date = date;
        this.gender = gender;
        this.cage = cage;
        this.numberOfBones = numberOfBones;
        this.isVertrebrate = isVertrebrate;
        this.foods = foods;
    }

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
     * @return the isVertrebrate
     */
    public boolean isIsVertrebrate() {
        return isVertrebrate;
    }

    /**
     * @param isVertrebrate the isVertrebrate to set
     */
    public void setIsVertrebrate(boolean isVertrebrate) {
        this.isVertrebrate = isVertrebrate;
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
