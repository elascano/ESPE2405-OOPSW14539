/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstracdtamanasgmentquizz;

import ec.edu.espe.controller.DataManagement;
import ec.edu.espe.controller.FileManager;
import ec.edu.espe.controller.JsonManager;
import ec.edu.espe.controller.Table;
import java.util.ArrayList;

/**
 *
 * @author heiso
 */
public class AbstracDtaManasgmentQuizz {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ArrayList<Table> tables = new ArrayList<>();
        DataManagement dataManagement;
        dataManagement = new JsonManager(tables);
        
        dataManagement.getTable();
    }
}
