/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

/**
 *
 * @author Erick
 */
public class BasicOperation {

    public static float addTwoNumbers(float addend1, float addend2) {
        float sum;
        sum = add(addend1, addend2);
        return sum;
    }

    private static float add(float addend1, float addend2) {
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    
    
}
