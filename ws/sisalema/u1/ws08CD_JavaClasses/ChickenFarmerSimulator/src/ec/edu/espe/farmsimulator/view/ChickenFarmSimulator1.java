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
 * @author Yostin Sisalema, Code Masters, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Sisalema's Chicken Farm Simulator");
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

    
    
/*
Chicken chicken = new Chicken(1, "Lucy", "Black", 1, true, LocalDate.now());

        System.out.println("Chicken --> " + chicken);

        int id = 2;
        String name = "Maruja";
        String color = "white";
        int age = 0;
        boolean molting = false;
        LocalDate bornOnDate = LocalDate.now();

        chicken = new Chicken(id, name, color, age, molting, bornOnDate);
        System.out.println("Chicken --> " + chicken);

        List<Chicken> chicken = new ArrayList<>();
        chicken.add(new Chicken(0, "Marcos", "brown", 1, true, new Date()));
        chicken.add(new Chicken(1, "Maruja", "Black", 3, false, new Date()));
        chicken.add(new Chicken(2, "Oscar", "White", 4, false, new Date()));
        chicken.add(new Chicken(3, "Oscar", "White", 1, true, new Date()));
        
        Chicken chickens = new Chicken(0, "Marcos", "brown", 1, true, new Date(2023, 1, 10));
         
        String folderPath = "output";
        File folder = new File(folderPath);

        if (!folder.exists()) {
            folder.mkdir();
        }

        try {
            FileManager.saveChicken(chickens.toString(1), "chickens", "csv");

        } catch (IOException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        Chicken chicken = new Chicken(1, "Lucy", "Black", 1, true, LocalDate.now());
*/
