/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ComputerShop.view;

import ec.edu.espe.ComputerShop.model.Computer;

/**
 *
 * @author Ricardo Lainez JEZHE SEA ESPE
 */
public class ShoppingSystem {
    public static void main(String[] args) {
        Computer computer;
        computer = new Computer(0, "hp", 1000);
        System.out.println("the price of the computer is--> "+computer.getPvp());
        System.out.println("--> "+computer);
    }
}
