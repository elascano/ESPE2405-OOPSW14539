/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exam2theory.model;

import java.util.ArrayList;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class C {
    private ArrayList<E> E = new ArrayList<>();

    public void addE(E e) {
        getE().add(e);
    }

    public C(E[] eArray) {
    }

    /**
     * @return the E
     */
    public ArrayList<E> getE() {
        return E;
    }

    /**
     * @param E the E to set
     */
    public void setE(ArrayList<E> E) {
        this.E = E;
    }
    
}