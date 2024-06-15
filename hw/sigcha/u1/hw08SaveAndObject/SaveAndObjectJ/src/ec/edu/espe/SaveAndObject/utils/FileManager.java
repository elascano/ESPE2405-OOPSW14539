package ec.edu.espe.SaveAndObject.utils;

import ec.edu.espe.SaveAndObject.model.Cellphone;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Kenned Sigcha, PPS
 */
public class FileManager {
    public static void saveObject(Cellphone cellphone){
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("Cellphone.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(cellphone);
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
