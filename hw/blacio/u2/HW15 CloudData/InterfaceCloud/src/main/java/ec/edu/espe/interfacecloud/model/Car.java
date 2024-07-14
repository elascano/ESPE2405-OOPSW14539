package ec.edu.espe.interfacecloud.model;

import java.time.Year;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Car {

    private String make;
    private String model;
    private int year;
    private int age;
    private double depreciation;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.age = calculateAge();
        this.depreciation = calculateDepreciation();
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
        this.age = calculateAge();
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    private int calculateAge() {
        return Year.now().getValue() - year;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the depreciation
     */
    public double getDepreciation() {
        return depreciation;
    }

    private double calculateDepreciation() {
        return age * 1000;
    }

}
