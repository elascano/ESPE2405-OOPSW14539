
package collections;

import ec.edu.espe.collections.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Collection things;
    things= new ArrayList();
        System.out.println("the size of the collection is --> " +things.size());
        
        Person person = new Person(0, "Julio");
        things.add(650);
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
