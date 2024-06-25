package ec.edu.espe.SaveAndObject.utils;

import ec.edu.espe.SaveAndObject.model.Doll;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author [Tu Nombre]
 */
public class FileManager {
    public static void saveObject(Doll doll){
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("Doll.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(doll);
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
