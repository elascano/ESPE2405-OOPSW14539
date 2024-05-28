package utils;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Erick
 */
public class FileManager {
    public static void save(String data, String fileName, String type) throws IOException {

        try (FileWriter writer = new FileWriter(fileName + "." + type, true)) {
            writer.write(data + "\n");
        }
    }
}
