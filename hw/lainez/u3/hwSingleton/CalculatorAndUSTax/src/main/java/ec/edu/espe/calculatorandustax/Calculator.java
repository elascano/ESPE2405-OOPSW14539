/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculatorandustax;

/**
 *
 * @author WINDOWS
 */
public class Calculator {
    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        tax.salesTotal();
    }
}