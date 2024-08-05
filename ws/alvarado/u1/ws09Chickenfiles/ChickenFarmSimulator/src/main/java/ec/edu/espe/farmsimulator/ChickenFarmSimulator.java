

package ec.edu.espe.farmsimulator;

import ec.edu.espe.farmsimulator.controller.FileManager;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Frank Alvaradom, As-Byte Wizards, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
       
        
         System.out.println("Frank's Chicken Farm Simulator");
        Chicken chicken = new Chicken(1,"Frank","Black",22,true,new Date());
        System.out.println("Chicken --> " + chicken);
        int id=2;
        String name= "Maruja";
        String color= "black";
        int age=1;
        boolean molting=false;
        Date bornOnDate=new Date();
        //NEW OBJECT AND PRINT
        chicken = new Chicken(id,name,color,age,molting, bornOnDate);
        System.out.println("Chicken 2 --> " + chicken + ", " + name + ", " + color + ", " + age + ", " + molting + ", " + bornOnDate);
        
        //PRIMITIVE DATA TYPES
        float addend1=1.2F;
        float addend2=2.4F;
        float sum = addend1 +addend2;
        System.out.println(sum);
        short minuend;
        minuend = (short)70000;
        System.out.println(minuend);
        char vowel='a';
        minuend=(short)vowel;
        System.out.println(minuend);
        Integer subtrahend;
        subtrahend=10;
        Float difference;
        difference= (float)(minuend-subtrahend);
        System.out.println(difference);
        
        // CAPTURE AND CSV FILE
             String folderPath = "output";
        File folder = new File(folderPath);

        if (!folder.exists()) {
            folder.mkdir();
        }

        try {
            FileManager.saveFile(chicken.toString(1), "Dates", "txt");

        } catch (IOException ex) {
            Logger.getLogger(ChickenFarmSimulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        //END METOD
       
    }
        
    }

