
package collections;

import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class Collections {
    
    
     public static void main(String[] args){
         Collection things;
         things = new ArrayList();
         System.out.println("size of collection is-->"+things.size());
         
         Person person = new Person (0, "Jerson");
         things.add(650);
         things.add("Hello OOP 14539");
         things.add(3343.27F);
         things.add(person);
         

         System.out.println("things-->"+things);
         things.remove(person);
      
         System.out.println("things-->"+things);
         
         
     }
}
