
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.FileManager;

/**
 *
 * @author Miguel Caiza, Overnight Developers Squad, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Miguel's Chicken Farm Simulator");
        Chicken chicken = new Chicken(0,"Lucy","White and brown",2,true,new Date());
        System.out.println("Chicken --> " + chicken);
        int id=2;
        String name= "Maruja";
        String color= "black";
        int age=1;
        boolean molting=false;
        Date bornOnDate=new Date();
        
        chicken = new Chicken(id,name,color,age,molting, bornOnDate);
        
        System.out.println("Chicken 2 --> " + chicken + ", " + name + ", " + color + ", " + age + ", " + molting + ", " + bornOnDate);
        
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
