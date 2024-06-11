/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Sjean
 */
public class Collections {
    public static void main(String[] args) {
    Collection things;
    things= new ArrayList();
        System.out.println("the size of the collection is --> " +things.size());
        
        Person person = new Person(0, "Jeancarlo");
        things.add(670);
        things.add("Hello OOP 14539, ");
        things.add(3343.27F);
        things.add(person);
       
        System.out.println("things -->" + things);
        
        things.remove(650);
        
        System.out.println("things -->" + things);
        
        things.remove(person);
        System.out.println("things -->" + things);



    }
}
