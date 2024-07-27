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
public class Lion extends Feline{

    public Lion(int Id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(Id, bornOnDate, cage, gender, numberOfLegs);
    }

    

    @Override
    public void feed(int food) {
        System.out.println("feeding a lion with " + food + " pounds of meat");
    }
    
    public void feed(int food, String type){
        System.out.println("feeding a lion with " + food + " " + type);
    }
    
    

    
    
}
