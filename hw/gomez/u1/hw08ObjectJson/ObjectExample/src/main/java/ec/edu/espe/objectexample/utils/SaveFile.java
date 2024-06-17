/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.objectexample.utils;

import ec.edu.espe.objectexample.model.Ball;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Autor: Joffre
 * Fecha: 2024-06-14
 * Descripción:
 */
public class SaveFile {
      public static void SaveObject(Ball ball){
     FileOutputStream fichero = null;
        try {
            fichero = new FileOutputStream("Student.dat");
            ObjectOutputStream file = new ObjectOutputStream(fichero);
            file.writeObject(ball);
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

