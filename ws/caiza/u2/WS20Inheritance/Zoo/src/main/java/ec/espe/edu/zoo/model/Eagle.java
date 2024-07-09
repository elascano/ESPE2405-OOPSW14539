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
public class Eagle extends Bird{

    public Eagle(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
    }

    @Override
    public void feed(int food) {
        System.out.println("Feeding an eagle with " + food + "mice");
    }
    
    //overloading
    public void feed(Food food){
        System.out.println("feeding an eagle with" + food);
    }
}
