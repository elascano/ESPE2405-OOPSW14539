/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author leydi
 */
public class Chicken {
    int id;
    String name;
    String color ;
    int age;
    boolean moltring;
    Date bornOnDate; 
    
    public String toString(int type){
    String chickenDate = "";
    if(type ==1){
        chickenDate= id + "," + name + "," + color + "," + age + "," + moltring + "," + bornOnDate;
    }
    if(type == 2){      //txt
            
    }
    if (type == 3){     //json
           
    }
    return chickenDate;
}

    public Chicken(int id, String name, String color, int age, boolean moltring, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.moltring = moltring;
        this.bornOnDate = bornOnDate;
    }

    public String toCSV() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return id + "," + name + "," + color + "," + age + "," + moltring + "," + dateFormat.format(bornOnDate);
    } 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMoltring() {
        return moltring;
    }

    public void setMoltring(boolean moltring) {
        this.moltring = moltring;
    }

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", moltring=" + moltring + ", bornOnDate=" + bornOnDate + '}';
    }
    
    
    
}
