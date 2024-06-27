
package ec.edu.espe.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author heiso
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;
    private Date bornOnDate;
    
    

    public Chicken(int id, String name, String color, int age, boolean molting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
         this.bornOnDate = bornOnDate;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public boolean getMolting() {
        return molting;
    }
    
    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMolting(boolean molting) {
        this.molting = molting;
    }
    
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + ", bornOnDate=" + bornOnDate + '}';
    }
    
    

}
