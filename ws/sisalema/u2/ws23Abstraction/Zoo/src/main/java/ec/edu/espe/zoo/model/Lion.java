/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Yostin Sisalema, Code Masters, DCCO - ESPE
 */
public class Lion extends Feline {
    public Lion(int id, Date bornOnDate, Cage cage, char gender, int numberOfLegs) {
        super(id, bornOnDate, cage, gender, numberOfLegs);
    }
    public void feed(int food){
        System.out.println("feeding an eagle with "+food+"mice");
    }
    public void feed(int food,String type){
        System.out.println("feeding a ios with "+food+""+type+"(s)");
    }
}
