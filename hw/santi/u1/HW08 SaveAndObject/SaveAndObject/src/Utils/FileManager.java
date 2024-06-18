/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import ec.edu.espe.SaveAndObject.Model.SantiStudent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Sjean
 */
public class FileManager {
      public static void SaveObject(SantiStudent student){
     FileOutputStream fichero = null;
        try {
            fichero = new FileOutputStream("Student.dat");
            ObjectOutputStream file = new ObjectOutputStream(fichero);
            file.writeObject(student);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fichero.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
