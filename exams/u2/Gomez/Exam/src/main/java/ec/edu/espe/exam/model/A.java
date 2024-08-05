/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Joffre
 */
public class A {  //0.5

    public A(ArrayList<A> as) {
        this.as = as;
    }

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }
private ArrayList <A> as; //0.5

    public ArrayList <A> getAs() {
        return as;
    }

    public void setAs(ArrayList <A> as) {
        this.as = as;
    }
}
