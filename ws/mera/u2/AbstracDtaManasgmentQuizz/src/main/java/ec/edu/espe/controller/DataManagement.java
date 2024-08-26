/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import java.util.ArrayList;

/**
 *
 * @author heiso
 */
public abstract class DataManagement {//2
    private ArrayList<Table> table;

    public DataManagement(ArrayList<Table> table) {
        this.table = table;
    }

    /**
     * @return the table
     */
    public ArrayList<Table> getTable() {
        return table;
    }
    
    
}
