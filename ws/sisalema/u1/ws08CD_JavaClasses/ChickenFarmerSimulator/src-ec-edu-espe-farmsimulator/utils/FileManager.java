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
        if (!type.equalsIgnoreCase("csv") && !type.equalsIgnoreCase("txt")&&!type.equalsIgnoreCase("json")) {
            throw new IllegalArgumentException("Unsupported file type: " + type);
        }if (!fileName.toLowerCase().endsWith("." + type)) {
            fileName += "." + type;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(data+"\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            throw e;
        }
    }
