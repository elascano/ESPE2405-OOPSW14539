/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import com.google.gson.Gson;
import ec.edu.espe.model.Fridge;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class ApplianceStore {
    public static void main(String[] args) {
        ArrayList fridges = new ArrayList();
        
        //fridges = FileManager.readJsonFile();
        fridges.add(Fridge.newFridgeInStock());
        fridges.add(Fridge.newFridgeInStock());
        fridges.add(Fridge.newFridgeInStock());
        
        FileManager.updateJsonFile(fridges);
        
    }
}
