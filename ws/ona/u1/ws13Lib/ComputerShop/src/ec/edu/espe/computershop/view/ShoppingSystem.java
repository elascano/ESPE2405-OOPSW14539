/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.computershop.view;

import ec.edu.espe.computershop.model.Computer;

/**
 *
 * @author CODE_CRAFTING_ENGINEERS
 */
public class ShoppingSystem {
    public static void main(String[] args) {
        Computer computer;
        computer = new Computer(0, "HP", 1000);
        System.out.println("the prince of this computer is -->"+ computer.getPvp());
    }
}
