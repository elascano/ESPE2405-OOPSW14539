/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Collections;
import java.util.ArrayList; 
import java.util.Collection;
import ec.edu.espe.collections.model.Person;

/**
 *
 * @author Yostin Sisalema,Code Maters,DCC0-ESPE
 */
public class Collections {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection things;
        things=new ArrayList();
        System.out.println("size at the beginnig"+things.size());
        
        Person person=new Person(0,"Yostin");
        things.add(650);
        things.add("Hello OOP 14539, ");
        things.add(3343.27F);
        things.add(person);        
        System.out.println("things-->"+things);
        things.remove(650);
        System.out.println("things-->"+things);
        things.remove(person);
        System.out.println("things-->"+things);        
    }    
}
