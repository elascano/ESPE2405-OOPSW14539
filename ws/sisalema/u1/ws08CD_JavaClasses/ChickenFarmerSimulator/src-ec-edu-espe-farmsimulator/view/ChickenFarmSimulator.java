/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;
/**
 *
 * @author Yostin Sisalema,Overnight Developers Squad, DCCO-ESPE
 */
public class ChickenFarmSimulator {
        public static void main(String[] args) {
        System.out.println("Hello chicken from Sisalema Yostin");
        Chicken chicken =new Chicken(1,"Lucy","White and brown",2,true,new Date());
        System.out.println("Chicken -->"+chicken);
        int id=2;
        String name="Maruja";
        String color="black";
        int age=1;
        boolean molting=false;
        Date bornOnDate=new Date();
        
        chicken=new Chicken(id,name,color,age,molting,bornOnDate);
        System.out.println("Chicken 2 -->"+chicken);
        }
}
