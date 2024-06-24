package collections;

import ec.espe.edu.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author David Pilaguano
 */
public class Collections {

    public static void main(String[] args) {
        
        Collection<Object> things = new ArrayList<>();
        System.out.println("the size at the beginning: " + things.size());
        
        Person person = new Person(0, "David");
        
        things.add(650);
        things.add("hello OOP 14539");
        things.add(5000.25F);
        things.add(person); 
        
        System.out.println("things--->" + things);
        
        things.remove(5000.25F);
        
        System.out.println("things--->" + things);
        
        things.remove(person);
        
        System.out.println("things--->" + things);
    }
}

