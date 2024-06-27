
package utils;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Molina Gallegos Gabriel Anthony, CodeCrafting Engineers
 */
public class FileManager {
    public static ArrayList readJsonFile(){
        File file = new File("stock.json");
        ArrayList fridges = new ArrayList();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("stock.json"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading products from CSV: " + e.getMessage());
        }
        
        return fridges;
    }
    
    public static void updateJsonFile(ArrayList fridges){
        Gson gson = new Gson();
        
        String json = gson.toJson(fridges);
        
        try (FileWriter writer = new FileWriter("stock.json")){
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
