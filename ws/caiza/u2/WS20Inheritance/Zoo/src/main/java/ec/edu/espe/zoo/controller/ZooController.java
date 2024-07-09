/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.zoo.controller;
import ec.espe.edu.zoo.model.Animal;
import ec.espe.edu.zoo.model.Cage;
import java.util.List;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class ZooController {
        List<Cage> cages;
        List<Animal> animals;

    public ZooController(List<Cage> cage, List<Animal> animals) {
        this.cages = cage;
        this.animals = animals;
    }
    public void addCage(Cage cage) {
        cages.add(cage);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        assignCageToAnimal(animal);
    }

    private void assignCageToAnimal(Animal animal) {
        Cage availableCage = findAvailableCage();
        if (availableCage!= null) {
            animal.setCage(availableCage);
            availableCage.addAnimal(animal);
        } else {
            System.out.println("No available cages!");
        }
    }

    private Cage findAvailableCage() {
        for (Cage cage : cages) {
            if (cage.getCapacity() > cage.getAnimal().size()) {
                return cage;
            }
        }
        return null;
    }            
}
