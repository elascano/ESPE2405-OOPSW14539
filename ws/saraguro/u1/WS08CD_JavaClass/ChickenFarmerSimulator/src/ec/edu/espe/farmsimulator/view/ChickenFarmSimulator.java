/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Leidy Saraguro, Paradigm Pioneers Squad, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Leidy's Chicken's Farm Simulator"); 
        Chicken chicken = new Chicken(1, "Sofia","black",5, true, new Date());
        System.out.println("Chicken--->"+ chicken);
        
        int id=2;
        String name="Maria";
        String color="brown";
        int age=10;
        boolean molting=true;
        Date bornOnDate=new Date();
    
        Chicken chicken2=new Chicken(id,name,color,age,molting,bornOnDate);
        System.out.println("Chicken-->" + chicken2);
    } 
}
