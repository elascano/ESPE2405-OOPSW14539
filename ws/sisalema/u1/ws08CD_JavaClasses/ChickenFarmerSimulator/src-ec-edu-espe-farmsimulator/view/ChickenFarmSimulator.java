/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.view;

import UtilityPackages.FileManager;
import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.model.ChickenFarmen;
import ec.edu.espe.farmsimulator.model.ChickenCoop;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Yostin Sisalema,Code Masters, DCCO-ESPE
 */
public class ChickenFarmSimulator {
        public static void main(String[] args) {
        System.out.println("Hello chicken from Sisalema Yostin");
        /*Chicken chicken =new Chicken(1,"Lucy","White and brown",2,true,new Date());
        System.out.println("Chicken -->"+chicken);
        int id=2;
        String name="Maruja";
        String color="black";
        int age=1;
        boolean molting=false;
        Date bornOnDate=new Date();
        
        chicken=new Chicken(id,name,color,age,molting,bornOnDate);
        System.out.println("Chicken 2 -->"+chicken);*/
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file type to save (csv/txt/json): ");
        String fileType = scanner.nextLine().toLowerCase();
        
        System.out.println("How many chicken farms do you want to put in the system?: ");
        int numberFarmer = scanner.nextInt();
    
        for(int j=0;j<numberFarmer;j++){
            System.out.println("Chicken farming Facts:\n"+(j+ 1)+".-Enter farmer ID:");
            int farmerId = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println((j+ 1)+".-Enter farmer name: ");
            String farmerName = scanner.nextLine().toLowerCase();

            System.out.println((j+ 1)+".-Number of chicken coop: ");
            int numberCoops = scanner.nextInt();

            ChickenCoop[] coops = new ChickenCoop[numberCoops];
            for(int k=0;k<numberCoops;k++){
                System.out.println("Chicken Coop Facts:\n"+(k+ 1)+".-Enter farmer ID:");
                int coopId = scanner.nextInt();
                scanner.nextLine(); 

                System.out.println((k+ 1)+".-Number of chicken coops: ");
                int numberChicken = scanner.nextInt();
                
                Chicken[] chickens = new Chicken[numberChicken];
                for(int i=0;i<numberChicken;i++){
                    System.out.println(".Chicken Facts:\n"+(i+ 1)+".-Enter farmer ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.println((i+ 1)+".-Enter chicken name: ");
                    String name = scanner.nextLine().toLowerCase();

                    System.out.println((i+ 1)+".-Enter chicken color: ");
                    String color = scanner.nextLine().toLowerCase();

                    System.out.println((i+ 1)+".-Is the chicken molting? (true/false): ");
                    boolean molting = scanner.nextBoolean();
                    scanner.nextLine();  

                    System.out.println((i+ 1)+".-Enter chicken birth date (dd/MM/yyyy): ");
                    String bornOnDateString = scanner.nextLine();
                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate bornOnDate = LocalDate.parse(bornOnDateString, dateFormat);

                    Chicken chicken = new Chicken(id, name, color, molting, bornOnDate);
                    chickens[i] = chicken;
                }
                coops[k] = new ChickenCoop(coopId, chickens);
            }
            
            ChickenFarmen chickenFarmen = new ChickenFarmen(farmerId, farmerName+"\n", coops);
            String chickenData = chickenFarmen.toString(fileType);
                      
            try {
                FileManager.save(chickenData, farmerName , fileType);
            } catch (IOException ex) {
                Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Could be saved in -->"+fileType);
    }
}

