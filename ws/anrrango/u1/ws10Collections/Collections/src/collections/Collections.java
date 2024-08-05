
package collections;

import ec.edu.espe.collections.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Mario Anrrango A-Byte Wizards, DCCO ESPE
 */
public class Collections {
    public static void main(String[] args) {
        
        Collection things;
        things = new ArrayList();
        System.out.println("The size of the collection is --> "+things.size());
        
        Person person = new Person (0, "Mario");
        things.add(650);
        things.add("Hello OOP");
        things.add(5000.25F);
        things.add(person);
        
        System.out.println("The size of the collection is --> "+things.size());
        System.out.println("things --> "+things);
        things.remove("Hello OOP");
        System.out.println("things --> "+things);
    }  
}
