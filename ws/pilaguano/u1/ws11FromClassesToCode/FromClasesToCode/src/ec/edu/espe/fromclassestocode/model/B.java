/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromclassestocode.model;

import java.util.ArrayList;

/**
 *
* @author David Pilaguano, Lenovo , DCCO-ESPE
 */
public class B {
    private int i;
    private ArrayList<C> cs;

    public B(int i, ArrayList<C> cs) {
        this.i = i;
        this.cs = cs;
    }

    @Override
    public String toString() {
        return "B{" + "i=" + getI() + ", cs=" + getCs() + '}';
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

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
    
    
    
    
    
}
