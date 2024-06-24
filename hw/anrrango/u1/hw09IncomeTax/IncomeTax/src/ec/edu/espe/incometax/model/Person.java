/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.incometax.model;

/**
 *
 * @author Mario Anrrango, A-Byte Wizards, DCCO - ESPE
 */
public class Person {
    private int id;
    private String name;
    private int salary;
    private float income = (salary * 12);

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", income=" + income + '}';
    }

    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.income = (salary * 12);
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
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the income
     */
    public float getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(float income) {
        this.income = income;
    }
   
}

