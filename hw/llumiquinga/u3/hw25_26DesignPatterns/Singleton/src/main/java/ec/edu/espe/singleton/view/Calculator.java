/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.controller.USTax;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */

public class Calculator {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        System.out.println("Number of Products is ---->: 5\nPrice: 10$");
        System.out.println("Total sale: " + tax.salesTotal(5.0F, 10));
        USTax tax2 = USTax.getInstance();
    }
}