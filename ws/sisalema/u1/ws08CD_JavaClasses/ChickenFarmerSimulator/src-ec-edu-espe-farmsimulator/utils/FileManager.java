/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsimulator.utils;


import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Yostin Sisalema,Code masters, DCCO-ESPE
 */
public class FileManager {
    public static void save(String data, String fileName, String type) throws IOException {

        try (FileWriter writer = new FileWriter(fileName + "." + type, true)) {
            writer.write(data + "\n");
        }
    }
}