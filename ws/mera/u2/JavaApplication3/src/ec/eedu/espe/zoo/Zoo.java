/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.eedu.espe.zoo;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Bird;
import ec.edu.espe.zoo.model.Cage;
import ec.edu.espe.zoo.model.Lion;
import ec.edu.espe.zoo.model.Monkey;
import ec.edu.espe.zoo.model.Primate;
import ec.edu.espe.zoo.model.Shark;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author heiso
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Inherence");
        
        ArrayList<Animal> animals= new ArrayList<>();
        
        Date date= new Date();
        Cage cage = new Cage();
        
        Lion lion = new lion(0, date, cage, 'm', 0);
        lion.feed(3);
        lion.feed(3,"deer");
        
        Shark shark = new shark();
        shark.feed(1);
        
        lion.register(3);
        
        Bird bird = new bird(0, date, cage, 'f', 0);
        bird.feed(1);
        
        Primate primate= new Monkey;
        
    }
    
}
