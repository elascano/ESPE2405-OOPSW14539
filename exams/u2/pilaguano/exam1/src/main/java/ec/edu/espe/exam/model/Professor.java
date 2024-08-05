/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.exam.model;

/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
public class Professor {
    private String id;
    private String name;
    private double salary;
    private String department;

    public Professor(String id, String name, String deparment, double salary) {
        this.id = id;
        this.name = name;
        this.department = deparment;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


//    public String getId() { 
//        return id; 
//    }
//    public void setId(String id) {
//        this.id = id; 
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) { 
//        this.name = name;
//    }
//    public double getSalary() {
//        return salary; 
//    }
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }

    @Override
    public String toString() {
        return "Professor{id='" + id + "', name='" + name + "', salary=" + salary + "}";
    }
}