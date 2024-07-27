/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class Shark extends Fish{

    public Shark(int Id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(Id, bornOnDate, cage, gender, numberOfLegs);
    }

    

    @Override
    public void feed(int food) {
        System.out.println("feeding a shark with " + food + " fish");    
    }
    
}
