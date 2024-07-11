/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.*;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author Leydi Oña
 */
public class Zoo {

    public static void main(String[] args) {
        System.out.println("Inheritance");
        
        ArrayList<Animal> animals =  new ArrayList<>();
        Date date = new Date();
        Cage cage = new Cage(1);
        Cage cageFelines =  new Cage(2);
        Cage pool  = new Cage(3);
        Lion lion = new Lion(0, date, cageFelines, 'm', 4);
        lion.feed(3);
        lion.feed(2, "deer");
        
        
        Shark shark = new Shark(0, date, pool, 'm', 0);

        lion.Register(3);

        Bird bird = new Eagle(0, date, cage, 'f', 2);
        bird.feed(1);
        Primate primate = new Monkey(0, date, cage, 'f', 0);
        primate.feed(5);

        Animal animal;
        animal = new Tiger(0, date, cageFelines, 'm', 4);
        animal.feed(3);
        animal.Register(3);
        animal = new Lion(0, date, cageFelines, 'm', 4);
        animal.feed(4);
        lion.feed(3, "zebra");
        
        System.out.println("Lion -->"+ lion);
        
        Eagle eagle = new Eagle(0, date, cage, 'f', 0);
        animals.add(eagle);
        
        System.out.println("-----> ANIMALS in my ZOO");
        System.out.println(animals);
        
        for (Animal ani : animals){
            System.out.println(ani);
                    
        }
             
    }
}
