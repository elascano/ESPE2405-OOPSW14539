/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromclasses.view;

import ec.edu.espe.fromclassestocode.model.C;
import ec.edu.espe.fromclassestocode.model.D;
import ec.edu.espe.fromclassestocode.model.E;
import java.util.ArrayList;

/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
public class FromClassesToCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        C c;
        D d;
        E e;
        ArrayList<C> cs = new ArrayList<>();
        
        c = new C();
        d = new D();
        cs.add(c);
        cs.add(new C());
        cs.add(new C());
        cs.remove(c);
        
        e = new E(cs);
        
        System.out.println("c-> "+c);
        System.out.println("d-> "+d);
        System.out.println("e-> "+e);
        System.out.println("cs-> "+cs);
        
        cs.forEach((otherC) -> System.out.println(otherC));
        
        
    }
    
}
