package ec.edu.espe.farmsimulator.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @autor Kerlly Chiriboga, ODS
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;
    private Date bornOnDate;

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Chicken {" + id + "," + name + "," + color + "," + age +  "," + molting + "," + dateFormat.format(bornOnDate) + '}';
    }
    
    public String toCSV() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return id + "," + name + "," + color + "," + age + "," + molting + "," + dateFormat.format(bornOnDate);
    }

    public Chicken(int id, String name, String color, boolean molting, Date bornOnDate) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOnDate = bornOnDate;
        this.age = computeAge(bornOnDate);
        this.molting = molting;
    }
    
    private int computeAge(Date bornOnDate) {
        Calendar birth = Calendar.getInstance();
        birth.setTime(bornOnDate);
        Calendar today = Calendar.getInstance();

        int years = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
            years--;
        }
        return years;
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

    public boolean isMolting() {
        return molting;
    }

    public void setMolting(boolean molting) {
        this.molting = molting;
    }

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
        this.age = computeAge(bornOnDate);
    }
}
