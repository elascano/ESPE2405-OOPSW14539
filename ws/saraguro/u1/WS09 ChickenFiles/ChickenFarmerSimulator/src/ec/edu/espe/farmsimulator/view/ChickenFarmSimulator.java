/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import com.google.gson.Gson;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import utils.FileManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leidy Saraguro, Paradigm Pioneers Squad, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        
        System.out.println("Leidy's Chicken Farm Simulator");

        String folderPath = "output";
        String csvFileName = "chickens";
        String jsonFileName = "chickens";
        
        List<Chicken> chickens = new ArrayList<>();
        
        Chicken chicken1 = new Chicken(1, "Anita", "brown", 2, true, new Date());
        chickens.add(chicken1);
        System.out.println("Chicken 1 --> " + chicken1);
        
        int id = 2;
        String name = "Fanny";
        String color = "white";
        int age = 1;
        boolean molting = true;
        Date bornOnDate = new Date();
        
        Chicken chicken2 = new Chicken(id, name, color, age, molting, bornOnDate);
        chickens.add(chicken2);
        System.out.println("Chicken 2 --> " + chicken2);
        
        Scanner entrance = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        
        try {
            System.out.println("Enter chicken 3 ID: ");
            id = entrance.nextInt();
            entrance.nextLine();
            
            System.out.println("Enter chicken 3 name: ");
            name = entrance.nextLine();
            
            System.out.println("Enter chicken 3 color: ");
            color = entrance.nextLine();
            
            System.out.println("Enter chicken 3 age: ");
            age = entrance.nextInt();
            entrance.nextLine();
            
            System.out.println("Enter if chicken 3 is molting or not (true/false): ");
            molting = entrance.nextBoolean();
            entrance.nextLine();
            
            System.out.println("Enter chicken 3 born date (yyyy-MM-dd): ");
            String bornOnDateString = entrance.nextLine();
            bornOnDate = dateFormat.parse(bornOnDateString); 
            
            Chicken chicken3 = new Chicken(id, name, color, age, molting, bornOnDate);
            chickens.add(chicken3);
            System.out.println("Chicken 3 --> " + chicken3);
            
            File folder = new File(folderPath);
            if (!folder.exists()) {
                folder.mkdir();
            }
        
            try {
                FileManager.save(chicken1.toString(1), folderPath, csvFileName, "csv");
                FileManager.save(chicken2.toString(1), folderPath, csvFileName, "csv");
                FileManager.save(chicken3.toString(1), folderPath, csvFileName, "csv");
                System.out.println("Chickens saved to CSV file.");
            } catch (IOException ex) {
                Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }

            try (FileWriter writer = new FileWriter(folderPath + "/" + jsonFileName + ".json")) {
                Gson gson = new Gson();
                gson.toJson(chickens, writer);
                System.out.println("Chickens saved to JSON file.");
            } catch (IOException ex) {
                Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ParseException ex) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            entrance.close();
        }
    }
}

   
    
    
    
    

