/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ws10collections;

import espe.edu.ec.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author heiso
 */
public class WS10Collections {

    public static void main(String[] args) {
        Collection things;
        things=new ArrayList();
        System.out.println("the size+ of the collection is --> "+things.size());
        
        Person person=new Person(0,"Heidy");
        things.add(650);
        things.add("Hello OPP 14539,");
        things.add(3343.27F);
        things.add(person);
        
        System.out.println("things--> "+things);
         
        things.remove(person);
        System.out.println("things ---> "+things);
    
    }
}
