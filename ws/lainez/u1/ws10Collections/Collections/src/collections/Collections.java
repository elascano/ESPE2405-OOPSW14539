
package collections;

import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author Marco Padilla ESPE CodeCrafting Engineers (CCE)
 */
public class Collections {
    public static void main(String[] args){
        Collection things;
        things = new ArrayList();
        System.out.println("the size of the collection is --> "+things.size());
        
        Person person = new Person(0, "Marco Padilla");
        things.add(650);
        things.add("hello OOP 14539, ");
        things.add(3343.27F);
        things.add(person);
        
        System.out.println("things--> "+things);
        things.remove(650);
        
        System.out.println("things--> "+things);
        things.remove(person);
        
        System.out.println("things--> "+things);
        
    }
}
