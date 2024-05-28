/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.utils.FileManage;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import java.util.*;

/**
 *
 * @author leydi
 */
public class ChickenFarmSimulator {
 
    public static void main(String[] args) {
        System.out.println("Leydi chicken form simulator");
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false); 
        
        System.out.println("Enter file type to save (csv/txt): ");
        String fileType = scanner.nextLine().toLowerCase();
        
        StringBuilder csvData = new StringBuilder();
        csvData.append("ID,Name,Color,Age,Molting,BornOnDate\n");
       
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter chicken data " + (i + 1) + ":");
            System.out.println("ID: ");
            int id = scanner.nextInt();
            
            scanner.nextLine(); 
            
            System.out.println("Name: ");
            String name = scanner.nextLine();
            
            System.out.println("Color: ");
            String color = scanner.nextLine();
            
            System.out.println("Molting (true/false): ");
            boolean molting = scanner.nextBoolean();
            
            scanner.nextLine();  
            
            Date bornOnDate = null;
            while (bornOnDate == null) {
                System.out.println("Born on Date (yyyy-MM-dd): ");
                String bornOnDateStr = scanner.nextLine();
                
                try {
                    bornOnDate = dateFormat.parse(bornOnDateStr);
                } catch (ParseException e) {
                    System.err.println("Invalid date format. Please use the format yyyy-MM-dd");
                }
            }
            LocalDate birthDate = bornOnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate currentDate = LocalDate.now();
            int age = Period.between(birthDate, currentDate).getYears();
            
            
            Chicken chicken = new Chicken(id, name, color, age, molting, bornOnDate);
            
            String data = chicken.toCSV();
            
            
            try {
                FileManage.save(data, "chickens", fileType);
            } catch (IOException e) {
                System.err.println("An error occurred while saving the data: " + e.getMessage());
            }
        }
        
        System.out.println("All chickens have been saved.");
         
         
         
    }
}
