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
public class Lion extends Feline{

    public Lion(int id, Date bornDate, Cage cage, char gender, int numverOfLegs) {
        super(id, bornDate, cage, gender, numverOfLegs);
    }

    
    
    @Override
    public void feed (int food){
        System.out.println("feeding a linon an eagle with "+food +"pouns of meed ");
    }
            
    public void feed(int food,String type){
        System.out.println("feeding a ios with "+food+" "+ type+"(s)");
    }
}
