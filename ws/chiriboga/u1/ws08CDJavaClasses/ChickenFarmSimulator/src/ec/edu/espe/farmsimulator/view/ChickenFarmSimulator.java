package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.model.ChickenCoop;
import ec.edu.espe.farmsimulator.model.ChickenFarmer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import utilg.FileManager;

public class ChickenFarmSimulator {
    public static void main(String[] args) throws IOException {
        System.out.println("Kerlly's Chicken Farm Simulator");
        try (Scanner scanner = new Scanner(System.in)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            int operation;
            
            do {
                System.out.println("Menu:");
                System.out.println("1. Create Chicken");
                System.out.println("2. Read Chickens");
                System.out.println("3. Update Chicken");
                System.out.println("4. Delete Chicken");
                System.out.println("5. Find Chicken");
                System.out.println("6. Exit");
                System.out.println("Enter operation: ");
                
                operation = scanner.nextInt();
                scanner.nextLine();
                
                switch (operation) {
                    case 1:
                        createChicken(scanner, dateFormat);
                        break;
                    case 2:
                        readChickens();
                        break;
                    case 3:
                        updateChicken(scanner, dateFormat);
                        break;
                    case 4:
                        deleteChicken(scanner);
                        break;
                    case 5:
                        findChicken(scanner);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid operation.");
                }
            } while (operation != 6);
        }
    }

    private static void createChicken(Scanner scanner, SimpleDateFormat dateFormat) throws IOException {
        Chicken chicken = getChickenDetails(scanner, dateFormat);

        System.out.println("Do you want to add this chicken to an existing coop? (yes/no): ");
        String addToCoop = scanner.nextLine().trim().toLowerCase();
        
        if (addToCoop.equals("yes")) {
            List<ChickenFarmer> farmers = FileManager.readAllFarmers();
            System.out.println("Available Farmers:");
            for (ChickenFarmer farmer : farmers) {
                System.out.println(farmer);
            }
            System.out.println("Enter Chicken Farmer ID to add the chicken to: ");
            int farmerId = scanner.nextInt();
            scanner.nextLine();
            ChickenFarmer farmer = FileManager.findFarmer(farmerId);
            
            if (farmer != null) {
                System.out.println("Available Coops:");
                for (ChickenCoop coop : farmer.getCoops()) {
                    System.out.println(coop);
                }
                System.out.println("Enter Chicken Coop ID to add the chicken to: ");
                int coopId = scanner.nextInt();
                scanner.nextLine();
                for (ChickenCoop coop : farmer.getCoops()) {
                    if (coop.getId() == coopId) {
                        coop.getChickens().add(chicken);
                        FileManager.updateFarmer(farmer);
                        System.out.println("Chicken added to existing coop successfully!");
                        return;
                    }
                }
                System.out.println("Chicken Coop not found.");
            } else {
                System.out.println("Chicken Farmer not found.");
            }
        } else {
            System.out.println("Enter Chicken Coop ID: ");
            int coopId = scanner.nextInt();
            scanner.nextLine();
            List<Chicken> chickens = new ArrayList<>();
            chickens.add(chicken);
            ChickenCoop chickenCoop = new ChickenCoop(coopId, chickens);

            System.out.println("Enter Chicken Farmer ID: ");
            int farmerId = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Chicken Farmer Name: ");
            String farmerName = scanner.nextLine();

            List<ChickenCoop> coops = new ArrayList<>();
            coops.add(chickenCoop);

            ChickenFarmer chickenFarmer = new ChickenFarmer(farmerId, farmerName, coops);

            FileManager.createFarmer(chickenFarmer);
            System.out.println("Chicken created successfully!");
            System.out.println(chickenFarmer);
        }
    }

    private static void readChickens() throws IOException {
        System.out.println("All Chickens: ");
        for (ChickenFarmer farmer : FileManager.readAllFarmers()) {
            System.out.println(farmer);
        }
    }

    private static void updateChicken(Scanner scanner, SimpleDateFormat dateFormat) throws IOException {
        System.out.println("Enter Chicken Farmer ID to update: ");
        int farmerId = scanner.nextInt();
        scanner.nextLine();
        ChickenFarmer farmer = FileManager.findFarmer(farmerId);
        if (farmer != null) {
            System.out.println("Enter Chicken ID to update: ");
            int chickenId = scanner.nextInt();
            scanner.nextLine();
            Chicken updatedChicken = getChickenDetails(scanner, dateFormat);
            updatedChicken.setId(chickenId);
            for (ChickenCoop coop : farmer.getCoops()) {
                for (int i = 0; i < coop.getChickens().size(); i++) {
                    if (coop.getChickens().get(i).getId() == chickenId) {
                        coop.getChickens().set(i, updatedChicken);
                        FileManager.updateFarmer(farmer);
                        System.out.println("Chicken updated successfully!");
                        return;
                    }
                }
            }
            System.out.println("Chicken not found in the specified farmer's coops.");
        } else {
            System.out.println("Chicken Farmer not found.");
        }
    }

    private static void deleteChicken(Scanner scanner) throws IOException {
        System.out.println("Enter Chicken Farmer ID to delete chicken from: ");
        int farmerId = scanner.nextInt();
        scanner.nextLine();
        ChickenFarmer farmer = FileManager.findFarmer(farmerId);
        if (farmer != null) {
            System.out.println("Enter Chicken ID to delete: ");
            int chickenId = scanner.nextInt();
            for (ChickenCoop coop : farmer.getCoops()) {
                coop.getChickens().removeIf(chicken -> chicken.getId() == chickenId);
            }
            FileManager.updateFarmer(farmer);
            System.out.println("Chicken deleted successfully!");
        } else {
            System.out.println("Chicken Farmer not found.");
        }
    }

    private static void findChicken(Scanner scanner) throws IOException {
        System.out.println("Enter Chicken Farmer ID to find chicken in: ");
        int farmerId = scanner.nextInt();
        scanner.nextLine();
        ChickenFarmer farmer = FileManager.findFarmer(farmerId);
        if (farmer != null) {
            System.out.println("Enter Chicken ID to find: ");
            int chickenId = scanner.nextInt();
            for (ChickenCoop coop : farmer.getCoops()) {
                for (Chicken chicken : coop.getChickens()) {
                    if (chicken.getId() == chickenId) {
                        System.out.println("Found Chicken: " + chicken);
                        return;
                    }
                }
            }
            System.out.println("Chicken not found in the specified farmer's coops.");
        } else {
            System.out.println("Chicken Farmer not found.");
        }
    }

    private static Chicken getChickenDetails(Scanner scanner, SimpleDateFormat dateFormat) {
        System.out.println("Enter chicken data:");
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

        return new Chicken(id, name, color, molting, bornOnDate);
    }
}
