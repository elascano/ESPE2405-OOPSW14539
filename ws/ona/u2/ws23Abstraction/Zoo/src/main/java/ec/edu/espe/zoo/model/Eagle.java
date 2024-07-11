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
public class Eagle extends Bird{

    public Eagle(int id, Date bornDate, Cage cage, char gender, int numverOfLegs) {
        super(id, bornDate, cage, gender, numverOfLegs);
    }
    
    
    
    @Override
    public void feed (int food){
        System.out.println("feeding en eagle with "+ food +"mice");
    }
    
    public void feed (Food food){
        System.out.println("feeling an eagle with "+ food);
    }
}
