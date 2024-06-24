/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.saveandobject.utils;

import ec.edu.espe.saveandobject.model.AnrrangoPet;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Mario Anrrango, A-Byte Wizards, DCCO - ESPE
 */
public class FileManager {

    public static void SaveObject(AnrrangoPet pet){
     FileOutputStream fichero = null;
        try {
            fichero = new FileOutputStream("Pet.dat");
            ObjectOutputStream file = new ObjectOutputStream(fichero);
            file.writeObject(pet);
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
