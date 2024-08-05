/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.testcasemru;

import ec.edu.espe.testcasemru.controller.CalculateVelocity;
import java.util.Scanner;

/**
 *
 * @author WINDOWS
 */
public class Testcasemru {

    public static void main(String[] args) {
        CalculateVelocity calculateVelocity = new CalculateVelocity();
        
        try{
            Scanner scanner = new Scanner (System.in);
            System.out.println("FORMULA VELOCIDAD DE MRU");
        
            System.out.print("distancia(en metros): ");
            double distance = scanner.nextFloat();
        
            System.out.print("tiempo (en segundos): ");
            double time = scanner.nextFloat();
        
            double velocity = calculateVelocity.velocity(distance, time);
            System.out.println("cuando la distancia es " +distance+ " y el tiempo " +time+ " la velocidad es: " +velocity + "m/s");
            
            if(velocity >0){
                System.out.println("se mueve hacia delante");
            }if(velocity == 0){
                System.out.println("en reposo");
            }if(velocity <0){
                System.out.println("va en reversa");
            }
            
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    
    
}
