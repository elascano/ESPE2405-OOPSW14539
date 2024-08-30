/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.zoo.model;

/**
 *
 * @author Damian Toscano
 */
public class Cage {
    private int id;

    @Override
    public String toString() {
        return "Cage{" + "id=" + id + '}';
    }

    public Cage(int id) {
        this.id=id;
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
    
    
}
