/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.fromclassestocode.view;

import ec.edu.espe.fromclassestocode.model.*;
import java.util.ArrayList;
/**
 *
 * @author Yostin Sisalema,Code Masters,DCCO-ESPE
 */
public class FromClassesToCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    C c;
    D d;
    E e;
    B b;
    A a;
    ArrayList<C> cs = new ArrayList<>();
    c = new C();
    d= new D();
    cs.add(c);
    cs.add(new C());
    cs.add(new C());
    cs.remove(c);
    b = new B(0,cs);
    a = new A(b, 0);
    e= new E(cs);
    cs.add(new C());
        System.out.println("c --> " + c);
        System.out.println("d --> " + d);
        System.out.println("e --> " + e);

        System.out.println("cs --> " + cs);

        cs.forEach((otherC) -> System.out.println(otherC));
        System.out.println("b --> " + b);
        System.out.println("a --> " + a);
    }
    
}
