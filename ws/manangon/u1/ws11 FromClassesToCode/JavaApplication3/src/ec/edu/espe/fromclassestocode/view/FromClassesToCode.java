/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromclassestocode.view;

import ec.edu.espe.fromclassestocode.model.A;
import ec.edu.espe.fromclassestocode.model.B;
import ec.edu.espe.fromclassestocode.model.C;
import ec.edu.espe.fromclassestocode.model.D;
import ec.edu.espe.fromclassestocode.model.E;
import java.util.ArrayList;

/**
 *
 * @author IAEN
 */
public class FromClassesToCode {
    public static void main(String[] args) {
        C c;
        D d;
        E e;
        A a;
        B b;
        
        
        ArrayList<C> cs = new ArrayList<>();
        
     c = new C();
        d = new D();
        cs.add(c);
        cs.add(new C());
        cs.add(new C());
        cs.remove(c);
        
        
        e = new E(cs);
        cs.add(new C());
        
        System.out.println("c--> "+c);
        System.out.println("d--> "+d);
        System.out.println("e--> "+e);
        
        b = new B(0, cs);
        a = new A(b, 0);
        
        System.out.println("cs--> " +cs);
        cs.forEach((otherC) -> System.out.println(otherC));
        System.out.println("a--> " +a);
        System.out.println("b--> " +b);
        
}
}
