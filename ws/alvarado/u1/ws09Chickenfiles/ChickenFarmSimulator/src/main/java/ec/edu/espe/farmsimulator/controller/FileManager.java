
package ec.edu.espe.farmsimulator.controller;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Frank Alvaradom, As-Byte Wizards, DCCO-ESPE
 */
public class FileManager {
      public static void saveFile(String data, String fileName, String type) throws IOException {

        try (FileWriter writer = new FileWriter(fileName + "." + type, true)) {
            writer.write(data + "\n");
        }
    }
}
