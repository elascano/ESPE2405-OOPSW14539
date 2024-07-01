
package ec.edu.espe.farmsimulator.controller;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

public class ChickenFarmer {
    public static void main(String[] args) {
        System.out.println("Hello Chicken from Mera Heidy");
        Chicken chicken = new Chicken(1,"Juan","white",2,true, new Date());
        System.out.println("Chicken 1 --> " +chicken);
        
        int id = 2;
        String name = "Pedro";
        String color= "White";
        int age = 1;
        boolean molting = false;
        Date bornOnDate = new Date();
        
        chicken = new Chicken (id, name, color, age, molting, bornOnDate);
        System.out.println("Chicken 2 -->" + chicken);
    }
}