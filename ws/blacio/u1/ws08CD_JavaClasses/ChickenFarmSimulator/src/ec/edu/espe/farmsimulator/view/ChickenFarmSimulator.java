package ec.edu.espe.farmsimulator.view;

import utils.FileManager;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        Chicken chicken = new Chicken(0, "Lucy", "White and brown", 2, true, new Date(2023, 1, 10));

        String folderPath = "output";
        File folder = new File(folderPath);

        if (!folder.exists()) {
            folder.mkdir();
        }

        try {
            FileManager.save(chicken.toString(1), "chickens", "csv");

        } catch (IOException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
