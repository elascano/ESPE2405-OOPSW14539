package ec.edu.espe.farmsimulator.view;

import utils.FileManager;
import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.model.ChickenCoop;
import ec.edu.espe.farmsimulator.model.ChickenFarmer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erick
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Erick's Chicken Farm Simulator");

        Scanner scanner = new Scanner(System.in);

        List<ChickenFarmer> farmers = new ArrayList<>();

        while (true) {
            System.out.println("Enter farmer details (or type 'exit' to finish):");

            System.out.print("Farmer ID: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")) break;
            int farmerId = Integer.parseInt(userInput);

            System.out.print("Farmer Name: ");
            String farmerName = scanner.nextLine();
            if (farmerName.equalsIgnoreCase("exit")) break;

            List<ChickenCoop> coops = new ArrayList<>();
            while (true) {
                System.out.println("Enter coop details for Farmer ID " + farmerId + " (or type 'done' to finish coops):");

                System.out.print("Coop ID: ");
                userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("done")) break;
                int coopId = Integer.parseInt(userInput);

                List<Chicken> chickens = new ArrayList<>();
                while (true) {
                    System.out.println("Enter chicken details for Coop ID " + coopId + " (or type 'done' to finish chickens):");

                    System.out.print("Chicken ID: ");
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("done")) break;
                    int chickenId = Integer.parseInt(userInput);

                    System.out.print("Chicken Name: ");
                    String chickenName = scanner.nextLine();
                    if (chickenName.equalsIgnoreCase("done")) break;

                    System.out.print("Chicken Color: ");
                    String chickenColor = scanner.nextLine();
                    if (chickenColor.equalsIgnoreCase("done")) break;

                    System.out.print("Chicken Age: ");
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("done")) break;
                    int chickenAge = Integer.parseInt(userInput);

                    System.out.print("Chicken Molting (true/false): ");
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("done")) break;
                    boolean chickenMolting = Boolean.parseBoolean(userInput);

                    System.out.print("Chicken Born On Date (yyyy-mm-dd): ");
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("done")) break;
                    Date chickenBornOnDate = java.sql.Date.valueOf(userInput);

                    Chicken chicken = new Chicken(chickenId, chickenName, chickenColor, chickenAge, chickenMolting, chickenBornOnDate);
                    chickens.add(chicken);
                }

                ChickenCoop coop = new ChickenCoop(coopId, chickens);
                coops.add(coop);
            }

            ChickenFarmer farmer = new ChickenFarmer(farmerId, farmerName, coops);
            farmers.add(farmer);
        }

        String folderPath = "output";
        File folder = new File(folderPath);

        if (!folder.exists()) {
            folder.mkdir();
        }

        try {
            for (ChickenFarmer farmer : farmers) {
                FileManager.save(farmer.toString(1),"/farmers", "csv");
            }
            System.out.println("Farmers have been saved to the CSV file.");
        } catch (IOException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
