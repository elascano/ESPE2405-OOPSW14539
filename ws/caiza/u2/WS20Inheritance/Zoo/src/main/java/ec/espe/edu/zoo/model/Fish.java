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
public abstract class Fish extends Animal{

    public Fish(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
    }

    @Override
    public abstract void feed(int food);
    
}
