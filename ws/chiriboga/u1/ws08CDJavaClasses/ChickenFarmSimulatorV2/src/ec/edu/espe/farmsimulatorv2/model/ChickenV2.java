package ec.edu.espe.farmsimulatorv2.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class ChickenV2 {
    private int id;
    private String name;
    private String color;
    private int age;
    private boolean molting;
    private Date bornOnDate;

    public ChickenV2(int id, String name, String color, boolean molting, Date bornOnDate) {
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

    public String toCSV() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return getId() + "," + getName() + "," + getColor() + "," + getAge() + "," + isMolting() + "," + dateFormat.format(getBornOnDate());
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "ChickenV2{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                ", molting=" + isMolting() +
                ", bornOnDate=" + dateFormat.format(getBornOnDate()) +
                '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id 
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
     * @param name 
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
     * @param color 
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
     * @param molting 
     */
    public void setMolting(boolean molting) {
        this.molting = molting;
    }

    /**
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate 
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }
}
