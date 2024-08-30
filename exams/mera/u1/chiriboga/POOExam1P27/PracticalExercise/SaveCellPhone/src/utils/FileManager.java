package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.savecellphone.model.CellPhone;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Kerlly Chiriboga, ODS
 */
public class FileManager {
    private static final List<CellPhone> cellPhones = new ArrayList<>();
    private static final String FILE_PATH = "cellPhones.json";
    private static final Gson gson = new Gson();
    
    public static void createCellPhone(Scanner scanner) {       
        System.out.println("Kerlly's Save CellPhone System");
        System.out.println("Enter the Data CellPhone");
       
        System.out.println("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Model: ");
        String model = scanner.nextLine();
        
        System.out.println("Storage: ");
        int storage = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Brand: ");
        String brand = scanner.nextLine();
        
        CellPhone cellPhone = new CellPhone(id, model, storage, brand);
        cellPhones.add(cellPhone);
        saveCellPhonesToJSON();
        System.out.println("Successfully Created CellPhone!");
    }
    
    public static void readCellPhone() {
        loadCellPhonesFromJSON();

        if (cellPhones.isEmpty()) {
            System.out.println("No cell phones found.");
        } else {
            for (CellPhone cellPhone : cellPhones) {
                System.out.println(cellPhone);
            }
        }
    }
    
    private static void saveCellPhonesToJSON() {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(cellPhones, writer);
        } catch (IOException e) {
            System.err.println("Error saving cell phones to JSON: " + e.getMessage());
        }
    }
    
    private static void loadCellPhonesFromJSON() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Type listType = new TypeToken<ArrayList<CellPhone>>(){}.getType();
            List<CellPhone> loadedCellPhones = gson.fromJson(reader, listType);
            cellPhones.clear();
            cellPhones.addAll(loadedCellPhones);
        } catch (IOException e) {
            System.err.println("Error loading cell phones from JSON: " + e.getMessage());
        }
    }
}
