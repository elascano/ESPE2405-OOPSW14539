/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.referenceddt.model;

/**
 *
 * @author Miguel Caiza , Overnight Developers Squad , DCCO - ESPE.
 */
public class Professor {

    private int id;
    private String name;
    private float salry;
    private boolean active;

    @Override
    public String toString() {
        return "Professor{" + "id=" + id + ", name=" + name + ", salry=" + salry + ", active=" + active + '}';
    }

    public Professor(int id, String name, float salry, boolean active) {
        this.id = id;
        this.name = name;
        this.salry = salry;
        this.active = active;
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
     * @return the salry
     */
    public float getSalry() {
        return salry;
    }

    /**
     * @param salry the salry to set
     */
    public void setSalry(float salry) {
        this.salry = salry;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

}
