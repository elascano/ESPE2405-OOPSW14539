/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.saveandobject.view;

import ec.edu.espe.saveandobject.model.AnrrangoPet;
import static ec.edu.espe.saveandobject.utils.FileManager.SaveObject;

/**
 *
 * @author Mario Anrrango, A-Byte Wizards, DCCO - ESPE
 */
public class PetSystem {
        public static void main(String[] args) {
        AnrrangoPet pet;
        pet = new AnrrangoPet(12, "Firulais", "Golden", "Gold", 50);
        System.out.println("Pet data --> " + pet);
      
        SaveObject(pet);
    }
}
