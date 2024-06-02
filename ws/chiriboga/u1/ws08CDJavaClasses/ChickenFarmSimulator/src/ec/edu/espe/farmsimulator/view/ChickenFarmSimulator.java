package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.model.ChickenCoop;
import ec.edu.espe.farmsimulator.model.ChickenFarmer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;
import utilg.FileManager;


/**
 * @autor Kerlly Chiriboga, ODS
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Kerlly's Chicken Farm Simulator");

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);

        System.out.println("Enter file type to save (csv/txt): ");
        String fileType = scanner.nextLine().toLowerCase();

        System.out.println("Enter Chicken Coop ID: ");
        int coopId = scanner.nextInt();
        scanner.nextLine();

        Chicken[] chickens = new Chicken[2];

        for (int i = 0; i < chickens.length; i++) {
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
                    System.err.println("Invalid date format. Please use yyyy-MM-dd");
                }
            }

            Chicken chicken = new Chicken(id, name, color, molting, bornOnDate);
            chickens[i] = chicken;
        }

        ChickenCoop chickenCoop = new ChickenCoop(coopId, chickens);

        System.out.println("Enter Chicken Farmer ID: ");
        int farmerId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Chicken Farmer Name: ");
        String farmerName = scanner.nextLine();

        ChickenCoop[] coops ={chickenCoop} ;
        ChickenFarmer chickenFarmer = new ChickenFarmer(farmerId, farmerName, coops);

        String farmerData = chickenFarmer.toString();

        try {
            FileManager.save(farmerData, "ChickenFarmSimulatorData", fileType);
        } catch (IOException e) {
            System.err.println("An error occurred while saving the data: " + e.getMessage());
        }

        System.out.println("All chickens and farmer have been saved!");
        System.out.println(chickenFarmer);
    }
}
