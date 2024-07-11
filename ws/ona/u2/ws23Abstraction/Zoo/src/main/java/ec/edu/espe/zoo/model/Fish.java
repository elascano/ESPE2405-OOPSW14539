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
public class Fish extends Mammal{

    public Fish(int id, Date bornDate, Cage cage, char gender, int numverOfLegs) {
        super(id, bornDate, cage, gender, numverOfLegs);
    }

    @Override
    public void feed(int food) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
