package utilgV2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManagerV2 {

    public static void save(String data, String fileName, String type) throws IOException {
        if (!type.equalsIgnoreCase("csv") && !type.equalsIgnoreCase("txt")) {
            throw new IllegalArgumentException("Unsupported file type: " + type);
        }

        if (!fileName.toLowerCase().endsWith("." + type)) {
            fileName += "." + type;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            throw e;
        }
    }
}
