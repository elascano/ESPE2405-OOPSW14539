/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Alfonso Arroyo. El Javas, ESPE
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Collection things;
        things = new ArrayList();
        System.out.println("The size of the collection is = "+things.size());
        
        Person person = new Person(0, "Alfonso");
        things.add(650);
        things.add("Hello OOP 14539");
        things.add(3343.27F);
        
        System.out.println("Things ="+things);
        
        things.remove(650);
        
        System.out.println("things ="+things);
        
        things.remove(person);
        
        System.out.println("things ="+things);
        
        
    }
    
}
