/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromclassestocode.model;

import java.util.ArrayList;

/**
 *
 * @author Miguel Caiza,Overnight Developers Squad,DCCO-ESPE
 */
public class E {

    /**
     * @return the cs
     */
    public ArrayList<C> getCs() {
        return cs;
    }

    /**
     * @param cs the cs to set
     */
    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }

    @Override
    public String toString() {
        return "E{" + "cs=" + cs + '}';
    }

    public E(ArrayList<C> cs) {
        this.cs = cs;
    }
    
    private ArrayList<C> cs;
    
}
