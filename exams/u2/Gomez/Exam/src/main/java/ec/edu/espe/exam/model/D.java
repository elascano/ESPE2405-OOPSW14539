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
public class D extends A{ //0.5

    public D(E[] es, ArrayList<F> efes, ArrayList<A> as) {  //0.2
        super(as);
        this.es = es;
        this.efes = efes;
    }
     private E[] es;
     private ArrayList<F> efes; //0.5

    public E[] getEs() {
        return es;
    }

    public void setEs(E[] es) {//0.2
        this.es = es;
    }

    public ArrayList<F> getEfes() {
        return efes;
    }

    public void setEfes(ArrayList<F> efes) {
        this.efes = efes;
    }

}
