/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.basicoperations.controller;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class BasicOperation {

    public static float addTwoNumbers(float addend1, float addend2) {
        float sum;
        
        
        sum = Math.round((addend1 + addend2) * 100.0f ) / 100.0f;
        return sum;
    }
}
