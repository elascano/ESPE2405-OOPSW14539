/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.zoo.model;

import java.util.Date;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class Condor extends Bird{
    
    private String mountain;
    
    public Condor(String mountain, int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
        this.mountain = mountain;
    }
    
    @Override
    public void feed(int food) {
        System.out.println("Feeding a Condor with " + food + "pounds of meat");
    }

    @Override
    public String toString() {
        return "Condor{" + "mountain=" + mountain + '}';
    }

    /**
     * @return the mountain
     */
    public String getMountain() {
        return mountain;
    }

    /**
     * @param mountain the mountain to set
     */
    public void setMountain(String mountain) {
        this.mountain = mountain;
    }
    
}
