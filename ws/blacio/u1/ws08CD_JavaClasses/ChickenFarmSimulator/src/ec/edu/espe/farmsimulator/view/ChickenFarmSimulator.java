package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.controller.SaveFile;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Julio's Chicken Farm Simulator");
        
        List<Chicken> chickens = new ArrayList<>();
        chickens.add(new Chicken(0, "Lucy", "White and brown", 2, true, new Date()));
        chickens.add(new Chicken(1, "Maruja", "Black", 1, false, new Date()));
        chickens.add(new Chicken(2, "Marcela", "White", 3, false, new Date()));

        String folderPath = "output";
        File folder = new File(folderPath);
        
        if (!folder.exists()) {
            folder.mkdir();
        }
        
        for (Chicken chicken : chickens) {
            System.out.println("Saving Chicken --> " + chicken);  
        try {
            SaveFile.saveChickenToFile(chicken, "chickenData.txt");
            System.out.println("Chicken data saved successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while saving chicken data: " + e.getMessage());
            }
        }
    }
}
