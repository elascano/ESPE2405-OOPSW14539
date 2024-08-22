/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperation.view;

import ec.edu.espe.basicoperations.controller.BasicOperation;
import ec.edu.espe.basicoperations.controller.PersonController;

/**
 *
 * @author Damian Toscano
 */
public class BasicOperations {
    public static void main(String[] args) {
        System.out.println("BASIC OERATIONS! \n Marco Padilla, OOP 14539");
        System.out.println("--> Unit testing in action <--");
        
        float addend1;
        float addend2;
        float sum;
        addend1 = 1.2F;
        addend2 = 2.4F;
        
        sum = add(addend1, addend2);
        
        System.out.println("the sum of " +addend1 +" + " +addend2+ " --> " +sum);
        
        
        addend1 = 1.3F;
        addend2 = 2.5F;
        
        sum = add(addend1, addend2);
        System.out.println("the sum of " +addend1 +" + " +addend2+ " --> " +sum);
         
        
        addend1 = 1.8F;
        addend2 = -2.2F;
        
        sum = BasicOperation.addTwoNumbers(addend1, addend2);
        System.out.println("the sum of " +addend1 +" + " +addend2+ " --> " +sum);
        
        PersonController personController = new PersonController();
        
    }

    private static float add(float addend1, float addend2) {
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
}
