package ec.edu.espe.farmsimulator.model;

import java.util.Date;
/**
 *
 * @author Mario Anrrango A-Byte Wizards, DCCO ESPE
 */
public class Chicken {
     private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;
    private Date BornOnDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + ", BornOnDate=" + BornOnDate + '}';
    }

    public Chicken(int id, String name, String color, int age, boolean molting, Date BornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
        this.BornOnDate = BornOnDate;
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
     * @return the BornOnDate
     */
    public Date getBornOnDate() {
        return BornOnDate;
    }

    /**
     * @param BornOnDate the BornOnDate to set
     */
    public void setBornOnDate(Date BornOnDate) {
        this.BornOnDate = BornOnDate;
    }
    
    
}
