/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Erick
 */
public class Eagle extends Bird {

    public Eagle(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
        region=3;
    }

    @Override
    public void feed(int food) {
        System.out.println("Feeding an eagle with " + food + "mice");
    }
  
    //Overloading
    public void feed(Food food){
        System.out.println("feeding an eagle with" + food);
    }
   
}
