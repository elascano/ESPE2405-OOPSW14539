package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.model.ChickenCoop;
import ec.edu.espe.farmsimulator.model.ChickenFarmer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private static final String FILE_PATH = "ChickenFarmSimulator.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void createChicken(Scanner scanner, SimpleDateFormat dateFormat) throws IOException {
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

    public static void readChickens() throws IOException {
        System.out.println("All Chickens: ");
        for (ChickenFarmer farmer : FileManager.readAllFarmers()) {
            System.out.println(farmer);
        }
    }

    public static void updateChicken(Scanner scanner, SimpleDateFormat dateFormat) throws IOException {
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

    public static void deleteChicken(Scanner scanner) throws IOException {
        System.out.println("Enter Chicken Farmer ID to delete chicken from: ");
        int farmerId = scanner.nextInt();
        scanner.nextLine();
        ChickenFarmer farmer = FileManager.findFarmer(farmerId);
        if (farmer != null) {
            System.out.println("Enter Chicken ID to delete: ");
            int chickenId = scanner.nextInt();
            scanner.nextLine();
            for (ChickenCoop coop : farmer.getCoops()) {
                Iterator<Chicken> iterator = coop.getChickens().iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().getId() == chickenId) {
                        iterator.remove();
                        FileManager.updateFarmer(farmer);
                        System.out.println("Chicken deleted successfully!");
                        return;
                    }
                }
            }
            System.out.println("Chicken not found in the specified farmer's coops.");
        } else {
            System.out.println("Chicken Farmer not found.");
        }
    }

    public static void findChicken(Scanner scanner) throws IOException {
        System.out.println("Enter Chicken Farmer ID to find chicken in: ");
        int farmerId = scanner.nextInt();
        scanner.nextLine();
        ChickenFarmer farmer = FileManager.findFarmer(farmerId);
        if (farmer != null) {
            System.out.println("Enter Chicken ID to find: ");
            int chickenId = scanner.nextInt();
            scanner.nextLine();
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

    public static void createFarmer(ChickenFarmer farmer) throws IOException {
        List<ChickenFarmer> farmers = readAllFarmers();
        if (farmers == null) {
            farmers = new ArrayList<>();
        }
        farmers.add(farmer);
        saveAllFarmers(farmers);
    }

    public static List<ChickenFarmer> readAllFarmers() throws IOException {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<ArrayList<ChickenFarmer>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    public static ChickenFarmer findFarmer(int id) throws IOException {
        List<ChickenFarmer> farmers = readAllFarmers();
        for (ChickenFarmer farmer : farmers) {
            if (farmer.getId() == id) {
                return farmer;
            }
        }
        return null;
    }

    public static void updateFarmer(ChickenFarmer updatedFarmer) throws IOException {
        List<ChickenFarmer> farmers = readAllFarmers();
        for (int i = 0; i < farmers.size(); i++) {
            if (farmers.get(i).getId() == updatedFarmer.getId()) {
                farmers.set(i, updatedFarmer);
                break;
            }
        }
        saveAllFarmers(farmers);
    }

    public static void deleteFarmer(int id) throws IOException {
        List<ChickenFarmer> farmers = readAllFarmers();
        farmers.removeIf(farmer -> farmer.getId() == id);
        saveAllFarmers(farmers);
    }

    private static void saveAllFarmers(List<ChickenFarmer> farmers) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(farmers, writer);
        }
    }
}
