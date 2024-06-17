/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.referenceddit.model;

/**
 *
 * @author WINDOWS
 */
public class Professor {
    private int Id;
    private String name;
    private float salary;
    private boolean active;

    public Professor(int Id, String name, float salary, boolean active) {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Professor{" + "Id=" + Id + ", name=" + name + ", salary=" + salary + ", active=" + active + '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
    
    
}
