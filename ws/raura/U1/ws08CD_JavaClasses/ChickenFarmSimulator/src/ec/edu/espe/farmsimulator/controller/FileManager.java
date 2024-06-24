package ec.edu.espe.farmsimulator.controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
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
    


/*FileManager.save(chicken.toString[1],"chickens","csv");*/