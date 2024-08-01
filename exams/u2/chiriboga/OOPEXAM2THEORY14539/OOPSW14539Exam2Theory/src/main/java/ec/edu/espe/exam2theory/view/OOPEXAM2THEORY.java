/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam2theory.view;

import ec.edu.espe.exam2theory.model.*;
import java.util.ArrayList;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class OOPEXAM2THEORY {
    public static void main(String[] args) {
        E[] eArray = { new E(), new E(), new E() }; 
        H hInstance = null;
       
        B bInstance = new B(hInstance);
        C cInstance = new C(eArray);
        F fInstance = new F();
        D dInstance = new D(fInstance);
        A aInstance = new A(bInstance, cInstance, dInstance);

        System.out.println("Class A --> " + aInstance);
        System.out.println("Class B --> " + bInstance);
        System.out.println("Class C --> " + cInstance);
        System.out.println("Class D --> " + dInstance);
        System.out.println("Class F --> " + fInstance);
        System.out.println("Class H --> " + hInstance);
    }
}
