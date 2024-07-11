/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Leydi Oña
 */
public abstract class Animal {

    private int id;
    private Date bornDate;
    private Cage cage;
    private char gender;
    private int numverOfLegs;
    protected int region;

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", bornDate=" + bornDate + ", cage=" + cage + ", gender=" + gender + ", numverOfLegs=" + numverOfLegs + '}';
    }

    public Animal(int id, Date bornDate, Cage cage, char gender, int numverOfLegs) {
        this.id = id;
        this.bornDate = bornDate;
        this.cage = cage;
        this.gender = gender;
        this.numverOfLegs = numverOfLegs;
    }
    
    
    
    public void Register ( int id){
        System.out.println("Register an aninimal ");
    }
    public abstract void feed(int food);
}
