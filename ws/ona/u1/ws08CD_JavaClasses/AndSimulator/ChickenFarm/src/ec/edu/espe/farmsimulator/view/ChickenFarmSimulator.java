/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author leydi
 */
public class ChickenFarmSimulator {
 
    public static void main(String[] args) {
        System.out.println("Leydi chicken form simulator");
        Chicken chicken = new Chicken(1,"Lucy","White and brown",2, true,new Date()) ;
        System.out.println("chicken --> " + chicken);
        
         int id =2;
         String name = "MAruja";
         String color = "black";
         int age = 1;
         boolean molting = false;
         Date bornOnDate = new Date();
         
         chicken = new Chicken(id,name,color,age,molting,bornOnDate);
         System.err.println("chicken 2 ==> "+chicken);
         
                }
}
