package utils;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ricardo Lainez JEZHE Association Software Engineers
 */

public class FileManager {
    public static void save(String data, String fileName, String type) throws IOException {
        try(FileWriter writer = new FileWriter(fileName+ " . " + type, true)){
            writer.write(data + "\n");
        }
    } 
}
