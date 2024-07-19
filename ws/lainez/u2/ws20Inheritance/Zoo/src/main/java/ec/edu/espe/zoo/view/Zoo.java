/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Animal;
import ec.edu.espe.zoo.model.Bird;
import ec.edu.espe.zoo.model.Cage;
import ec.edu.espe.zoo.model.Condor;
import ec.edu.espe.zoo.model.Eagle;
import ec.edu.espe.zoo.model.Lion;
import ec.edu.espe.zoo.model.Monkey;
import ec.edu.espe.zoo.model.Primate;
import ec.edu.espe.zoo.model.Shark;
import ec.edu.espe.zoo.model.Tiger;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author WINDOWS
 */
public class Zoo {
    public static void main(String[] args) {
        System.out.println("hellow inheritance!");
        
        ArrayList<Animal> animals = new ArrayList<>();
    
        Date date = new Date();
        Cage cage = new Cage(1);
        Cage cageFelines = new Cage(2);
        Cage pool = new Cage(3);
        
        Lion lion = new Lion(0, date, cageFelines, 'm', 4);
        
        animals.add(lion);
        lion.feed(3);
        lion.feed(2, "deer");
        
        Shark shark = new Shark(0, date, pool, 'f', 0);
        animals.add(shark);
        shark.feed(1);
        
        lion.register(3);
        
        Bird bird = new Eagle(0, date, cage, 'm', 2);
        bird.feed(1);
        animals.add(bird);

        Primate primate = new Monkey(0, date, cage, 'f', 4);
        primate.feed(5);
        animals.add(primate);
        primate.register(5);

        Animal animal;
        animal = new Tiger(0, date, cageFelines, 'm', 4);
        animal.feed(3);
        animals.add(animal);
        animal.register(6);

        animal = new Lion(0, date, cageFelines, 'f', 4);
        animal.feed(4);
        animals.add(animal);
        lion.feed(3, "zebra");

        System.out.println("Lion --> " + lion);

        Eagle eagle = new Eagle(0, date, cage, 'm', 2);
        animals.add(eagle);

        Condor condor = new Condor("Andes", 0, date, cage, 'm', 2);
        animals.add(condor);

        System.out.println("     ANIMALS IN MY ZOO Ricardo Lainez");
        System.out.println(animals);

        for (Animal ani : animals) {
            System.out.println(ani);
        }

    }
        
        
    
}
