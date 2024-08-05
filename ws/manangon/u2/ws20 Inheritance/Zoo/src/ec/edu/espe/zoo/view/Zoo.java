/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Lion;
import ec.edu.espe.zoo.model.Shark;

/**
 *
 * @author IAEN
 */
public class Zoo {
    public static void main(String[] args){
        System.out.println("Hello Inheritance");
        
        Lion lion = new Lion();
        Shark shark = new Shark();
        
        lion.register(3);
        
        
    }
}
