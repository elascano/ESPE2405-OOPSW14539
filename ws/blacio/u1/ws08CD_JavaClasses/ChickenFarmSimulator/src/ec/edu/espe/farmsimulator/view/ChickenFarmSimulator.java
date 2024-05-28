package ec.edu.espe.farmsimulator.view;

import utils.FileManager;
import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.model.ChickenCoop;
import ec.edu.espe.farmsimulator.model.ChickenFarmer;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Julio's Chicken Farm Simulator");

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Enter the number of farmers:");
        int numberOfFarmers = scanner.nextInt();

        System.out.println("Select the output format:");
        System.out.println("1. CSV");
        System.out.println("2. TXT");
        System.out.println("3. JSON");
        int formatChoice = scanner.nextInt();

        String folderPath = "output";
        File folder = new File(folderPath);

        if (!folder.exists()) {
            folder.mkdir();
        }

        try {
            for (int i = 0; i < numberOfFarmers; i++) {
                System.out.println("Enter details for farmer " + (i + 1) + ":");

                System.out.print("ID: ");
                int farmerId = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                System.out.print("Name: ");
                String farmerName = scanner.nextLine();

                System.out.print("Number of chicken coops: ");
                int numberOfCoops = scanner.nextInt();

                ChickenCoop[] coops = new ChickenCoop[numberOfCoops];

                for (int j = 0; j < numberOfCoops; j++) {
                    System.out.println("Enter details for chicken coop " + (j + 1) + ":");

                    System.out.print("ID: ");
                    int coopId = scanner.nextInt();

                    System.out.print("Number of chickens: ");
                    int numberOfChickens = scanner.nextInt();

                    Chicken[] chickens = new Chicken[numberOfChickens];

                    for (int k = 0; k < numberOfChickens; k++) {
                        System.out.println("Enter details for chicken " + (k + 1) + ":");

                        System.out.print("ID: ");
                        int chickenId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline

                        System.out.print("Name: ");
                        String chickenName = scanner.nextLine();

                        System.out.print("Color: ");
                        String chickenColor = scanner.nextLine();

                        System.out.print("Born on date (yyyy-MM-dd): ");
                        String bornOnDateString = scanner.nextLine();
                        Date chickenBornOnDate = dateFormat.parse(bornOnDateString);

                        System.out.print("Is molting? (true/false): ");
                        boolean chickenMolting = scanner.nextBoolean();

                        chickens[k] = new Chicken(chickenId, chickenName, chickenColor, chickenMolting, chickenBornOnDate);
                    }

                    coops[j] = new ChickenCoop(coopId, chickens);
                }

                ChickenFarmer farmer = new ChickenFarmer(farmerId, farmerName, coops);

                String data = farmer.toString(formatChoice);
                String extension = getExtension(formatChoice);
                FileManager.save(data, folderPath + "/farmData", extension);
            }

        } catch (IOException | ParseException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String getExtension(int formatChoice) {
        switch (formatChoice) {
            case 1:
                return "csv";
            case 2:
                return "txt";
            case 3:
                return "json";
            default:
                throw new IllegalArgumentException("Unsupported format: " + formatChoice);
        }
    }
}
