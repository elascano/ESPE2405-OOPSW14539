/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author heiso
 */
public class Tiger extends Feline{

    public Tiger(int id, Date bornOnDate, Cage cage, char gerder, int numberOfLegh) {
        super(id, bornOnDate, cage, gerder, numberOfLegh);
    }

    @Override
    public void food(int food) {
        System.out.println("Feeding an tiger whit" + food + " nice");
    }
    
}
