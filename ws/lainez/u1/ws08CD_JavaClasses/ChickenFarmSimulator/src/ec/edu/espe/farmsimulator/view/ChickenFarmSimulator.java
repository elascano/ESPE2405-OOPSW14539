/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Ricardo Lainez JEZHE assosiation software engineers - DCCO ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) { //psvm
        System.out.println("Ricardo´s Chicken Farm Simulator");
        Chicken chicken = new Chicken(1, "lucy", "white and brown", 4, true, new Date());
        
        System.out.println("chicken "+chicken);
        
        int id = 2;
        String name = "maruja";
        String color = "black";
        int age = 4;
        boolean molting = false;
        Date bornOnDate = new Date();
        chicken = new Chicken(id, name, color, age, molting, bornOnDate);
        System.out.println("chicken 2 -->" +chicken);
    }
}




//Chicken chicken = new Chicken(1, "lucy", "white and brown", 4, true, new Date());
        
  //      System.out.println("chicken "+chicken);
        //CREAR FILE MANAGE 
        //CREAR UN METODO SAVE
