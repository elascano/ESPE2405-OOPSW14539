/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Leidy Saraguro, Paradigm Pioneers Squad, DCCO-ESPE
 */
public class FileManager {
    public static void save(String data, String folderPath, String fileName, String fileType) throws IOException {
        String filePath = folderPath + "/" + fileName + "." + fileType;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(data);
            writer.newLine();
        }
    }
    
     public static void deleteFileContent(String folderPath, String fileName, String fileType) throws IOException {
        String filePath = folderPath + "/" + fileName + "." + fileType;
        try (PrintWriter writer = new PrintWriter(filePath)) {
            writer.print("");
        }
    }
}
    