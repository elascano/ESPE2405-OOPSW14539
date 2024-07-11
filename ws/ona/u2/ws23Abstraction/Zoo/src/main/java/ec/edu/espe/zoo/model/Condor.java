/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Leydi Oña
 */
public class Condor extends Bird{
    String mountain;

    public Condor(int id, Date bornDate, Cage cage, char gender, int numverOfLegs) {
        super(id, bornDate, cage, gender, numverOfLegs);
        this.mountain = mountain;
    }

    @Override
    public String toString() {
        super.toString();
        return "Condor{" + "mountain=" + mountain + '}'+super.toString();
    }
    

    
    @Override
    public void feed(int food){
        System.out.println("feef");
    }
    
}
