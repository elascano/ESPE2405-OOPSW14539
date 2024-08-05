
package ec.edu.espe.SaveSmartTVObject.utils;

import ec.edu.espe.SaveSmartTVObject.model.SmartTVPadilla;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Marco Padilla, CodeCrafting Engineers, DCCO-ESPE
 */
public class FileManager {
    public static void saveObject(SmartTVPadilla smartTV){
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("SmartTV.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(smartTV);
            objectOut.close();
            System.out.println("The SmartTVPadilla object was successfully written to a file");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (fileOut != null) {
                    fileOut.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
