
package ec.edu.ec.farmsimulator.model;

import java.util.Date;


public class Chicken {
    
      private int id;
    private String name;
    private String color;
    private int a ;
    private boolean b;
    private Date BornOnDate;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", a=" + a + ", b=" + b + ", BornOnDate=" + BornOnDate + '}';
    }

    public Chicken(int id, String name, String color, int a, boolean b, Date BornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.a = a;
        this.b = b;
        this.BornOnDate = BornOnDate;
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

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public Date getBornOnDate() {
        return BornOnDate;
    }

    public void setBornOnDate(Date BornOnDate) {
        this.BornOnDate = BornOnDate;
    }
    
}
