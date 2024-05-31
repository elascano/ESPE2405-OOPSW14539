/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import ec.edu.espe.collection.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class Colection {
    public static void main(String[] args) {
        Collection things;
        things = new ArrayList();
        System.out.println("the size of the colection is -->"+things.size());
        Person person;
        person = new Person(0, "Mguel");
        things.add(650);
        things.add("Hello OOP 14539, ");
        things.add(3343.27F);
        things.add(person);
        
        System.out.println("Things --> " + things);
        
        things.remove(650);
        
        System.out.println("Things --> " + things);
        
        things.remove(person);
        
        System.out.println("Thigns -->" + things);
    }
}
