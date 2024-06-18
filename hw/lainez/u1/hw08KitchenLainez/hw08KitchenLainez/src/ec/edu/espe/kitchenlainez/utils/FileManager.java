/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.kitchenlainez.utils;

import ec.edu.espe.kitchenlainez.model.Kitchen;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author WINDOWS
 */
public class FileManager {
    public static void saveObject(Kitchen kitchen){
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("KitchenLainez.dat");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(kitchen);
            objectOut.close();
            System.out.println("The KitchenLainez object was successfully written to a file");
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
