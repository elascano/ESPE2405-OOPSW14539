/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.model;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Yostin Sisalema,Code Masters, DCCO-ESPE
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;
    private LocalDate bornOnDate;


    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + ", BornOnDate=" + BornOnDate + '}';
    }
    
    public Chicken(int id, String name, String color, boolean molting, LocalDate bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.molting = molting;
        this.bornOnDate = bornOnDate;
        this.age = CalculationAge(bornOnDate);
    }
    
     private int CalculationAge(LocalDate bornOnDate) {
    LocalDate today = LocalDate.now();
    if (bornOnDate != null) {
        return Period.between(bornOnDate, today).getYears();
    } else {
        return 0;
    }
}
    public String toString(String type) {
        String chickenData = "";
        if (type.equals("csv")) { // csv
            chickenData = id + "," + name + "," + color + "," + CalculationAge(bornOnDate) + "," + molting + "," + getBornOnDate();
        } else if (type.equals("txt")) { // txt
            chickenData = "Chicken{id=" + id + ", name=" + name + ", color=" + color + ", age=" + CalculationAge(bornOnDate) + ", molting=" + molting + ", BornOnDate=" + getBornOnDate() + "}";
        } else if (type.equals("json")) { // json
            chickenData = "{ \"id\": " + id + ", \"name\": \"" + name + "\", \"color\": \"" + color + "\", \"age\": " + CalculationAge(bornOnDate) + ", \"molting\": " + molting + ", \"BornOnDate\": \"" + getBornOnDate()+ "\" }";
        }
        return chickenData;
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
    public LocalDate getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(LocalDate bornOnDate) {
        this.age = CalculationAge(bornOnDate);
        this.bornOnDate = bornOnDate;
    }    
}

