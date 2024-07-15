/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Ricardo Lainez
 */
public class Condor extends Bird{
    private String mountain;

    public Condor(String mountain, int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
        this.mountain = mountain;
    }

    @Override
    public String toString() {
        return "Condor{" + "mountain=" + mountain + '}' + super.toString();
    }
    
    @Override
    public void feed(int food) {
        System.out.println("feeding a Conder with " + food + "pounds of meat");
    }

    public String getMountain() {
        return mountain;
    }

    public void setMountain(String mountain) {
        this.mountain = mountain;
    }
    
    

    
    
}
