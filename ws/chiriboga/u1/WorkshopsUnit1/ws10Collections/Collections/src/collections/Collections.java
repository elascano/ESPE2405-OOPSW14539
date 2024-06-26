package collections;

import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class Collections {
    public static void main(String[] args) {
        Collection things;
        things = new ArrayList();
        System.out.println("The size of the collection is --> " + things.size());
        
        Person person =new Person(0, "Kerlly");
        things.add(650);
        things.add("Hello OPP 14539");
        things.add(3343.27F);
        things.add(person);
        
        System.out.println("Things --> " + things);
        
        things.remove(650);
        
        System.out.println("Things --> " + things);
        
        things.remove(person);
        System.out.println("Things --> " + things);
    }
}
