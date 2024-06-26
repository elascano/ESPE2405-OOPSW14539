/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.calculateincometax.model;

/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
public class Employee {
    private int id;
    private String name;
    private String birthDate;
    private String gender;
    private float salary;
    private float incometax;
    private float netSalary;
    private float sure;
   
    public Employee(int id, String name, String birthDate, String gender, float salary) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.salary = salary;
        this.incometax = Tax.calculateIt(salary);
        this.sure = (float) (salary * 11.15/100.0f);
        this.netSalary = salary - this.incometax*salary - this.sure;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", gender=" + gender + ", salary=" + salary + ", incometax=" + incometax + ", netSalary=" + netSalary + ", sure=" + sure + '}';
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
     * @return the birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
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
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the incometax
     */
    public float getIncometax() {
        return incometax;
    }

    /**
     * @param incometax the incometax to set
     */
    public void setIncometax(float incometax) {
        this.incometax =  Tax.calculateIt(salary);
    }

    public float getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(float netSalary) {
        this.netSalary = salary - this.incometax - this.sure;
    }

    public float getSure() {
        return sure;
    }

    public void setSure(float sure) {
        this.sure = sure;
    }
    
}