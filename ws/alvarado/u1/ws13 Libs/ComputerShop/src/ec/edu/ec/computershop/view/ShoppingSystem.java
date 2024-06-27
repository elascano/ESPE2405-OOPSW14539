/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.computershop.view;

import ec.edu.ec.computershop.modle.Computer;

/**
 *
 * @author Frank Alvaradom, As-Byte Wizards, DCCO-ESPE
 */
public class ShoppingSystem {
    public static void main(String[] args) {
        
        Computer com = new Computer(0,"HP" , 1000);
        System.out.println("the price of this computer is--->"+com.getPvp());
        
    }
}
