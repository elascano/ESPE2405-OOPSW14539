/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilityPackages;
import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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

    public static void fileRead(String fileName[], String type) {
        String data = "";
        int counter;
        try {
            FileReader reader = new FileReader(fileName + "." + type);
            while ((counter = reader.read()) != -1) {
                data += (char) counter;
            }
            reader.close(); 
        }catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        System.out.println("The counter is --> " + data); 
    }
}
