/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam.model;

import java.util.ArrayList;

/**
 *
 * @author Joffre
 */
public class C extends A { //0.5

    public C(ArrayList<E> es, ArrayList<A> as) { //0.2
        super(as);
        this.es = es;
    }
   private ArrayList<E> es; //0.5

    public ArrayList<E> getEs() { //0.2
        return es;
    }

    public void setEs(ArrayList<E> es) {
        this.es = es;
    }


}
