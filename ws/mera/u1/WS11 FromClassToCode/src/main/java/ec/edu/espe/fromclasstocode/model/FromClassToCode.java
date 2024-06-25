/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.fromclasstocode.model;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author heiso
 */
public class FromClassToCode {

    public static void main(String[] args) {
        C c;
        D d;
        E e;
        ArrayList<C> cs =new ArrayList<>();

    
        c= new C();
        d= new D();
        cs.add(c);
        cs.add(new C());
        cs.add(new C());
        cs.remove(c);
        
        e= new E(cs);
        
        System.out.println("c->"+c);
        System.out.println("d->"+d);
        System.out.println("e->"+e); 
        System.out.println("cs->"+cs);
        

        System.out.println();
        
    }
}
