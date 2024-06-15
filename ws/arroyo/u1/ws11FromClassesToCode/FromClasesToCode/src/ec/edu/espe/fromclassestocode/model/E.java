/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromclassestocode.model;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class E {
    private ArrayList<C> cs;

    public E(ArrayList<C> cs) {
        this.cs = cs;
    }

    @Override
    public String toString() {
        return "E{" + "cs=" + getCs() + '}';
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
