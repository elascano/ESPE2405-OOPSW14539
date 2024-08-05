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
import java.util.List;
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

        System.out.println("Select an operation:");
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        int operationChoice = scanner.nextInt();

        System.out.println("Select the output format:");
        System.out.println("1. CSV");
        System.out.println("2. TXT");
        System.out.println("3. JSON");
        int formatChoice = scanner.nextInt();

        String folderPath = "output";
        String fileExtension = getExtension(formatChoice);
        File folder = new File(folderPath);

        if (!folder.exists()) {
            folder.mkdir();
        }

        try {
            switch (operationChoice) {
                case 1: // Create
                    createData(scanner, dateFormat, folderPath, fileExtension, formatChoice);
                    break;
                case 2: // Read
                    findAndPerformOperation(scanner, folderPath, fileExtension, "read");
                    break;
                case 3: // Update
                    findAndPerformOperation(scanner, folderPath, fileExtension, "update");
                    break;
                case 4: // Delete
                    findAndPerformOperation(scanner, folderPath, fileExtension, "delete");
                    break;
                default:
                    System.out.println("Invalid operation choice.");
            }
        } catch (IOException | ParseException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void createData(Scanner scanner, SimpleDateFormat dateFormat, String folderPath, String fileExtension, int formatChoice) throws IOException, ParseException {
        System.out.println("Enter the number of farmers:");
        int numberOfFarmers = scanner.nextInt();

        for (int i = 0; i < numberOfFarmers; i++) {
            System.out.println("Enter details for farmer " + (i + 1) + ":");

            System.out.print("Farmer ID: ");
            int farmerId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Farmer Name: ");
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
                    scanner.nextLine();

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
            FileManager.save(data, folderPath + "/farmData", fileExtension);
        }
    }

    private static void findAndPerformOperation(Scanner scanner, String folderPath, String fileExtension, String operation) throws IOException {
        scanner.nextLine(); 
        System.out.println("Enter the search keyword:");
        String keyword = scanner.nextLine();

        List<String> foundData = FileManager.find(keyword, folderPath + "/farmData", fileExtension);
        if (foundData.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        for (String data : foundData) {
            System.out.println(data);
        }

        if ("read".equals(operation)) {
            // Just display the found data
        } else if ("update".equals(operation)) {
            System.out.println("Enter the data to be updated:");
            String oldData = scanner.nextLine();

            System.out.println("Enter the new data:");
            String newData = scanner.nextLine();

            FileManager.update(oldData, newData, folderPath + "/farmData", fileExtension);
        } else if ("delete".equals(operation)) {
            System.out.println("Enter the data to be deleted:");
            String dataToDelete = scanner.nextLine();

            FileManager.delete(dataToDelete, folderPath + "/farmData", fileExtension);
            System.out.println("Data deleted successfully.");
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
