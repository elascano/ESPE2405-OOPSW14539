/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromclassestocode.model;

import java.util.ArrayList;

/**
 *
 * @author Yostin Sisalema,Code Masters,DCCO-ESPE
 */
public class B {
    private int i;
    private ArrayList<C> cs;

    public B(int i, ArrayList<C> cs) {
        this.i = i;
        this.cs = cs;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public ArrayList<C> getCs() {
        return cs;
    }

    public void setCs(ArrayList<C> cs) {
        this.cs = cs;
    }

    @Override
    public String toString() {
        return "B{" + "i=" + i + ", cs=" + cs + '}';
    }
}
