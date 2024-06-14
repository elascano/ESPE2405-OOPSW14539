/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.fromclasstocode.model;

import java.util.ArrayList;

/**
 *
 * @author Ricardo Lainez JEZHE assosiation software engineers - DCCO ESPE
 */
public class E {
    private ArrayList<C> cs; //encapsular el atributo
    
    //crear el constructor

    public E(ArrayList<C> cs) {
        this.cs = cs;
    }
    
    //crear el toString

    @Override
    public String toString() {
        return "E{" + "cs=" + cs + '}';
    }
    
    
    
}
