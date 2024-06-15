package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Pilaguano
 */
public class FileManager {

    public static void save(String data, String fileName, String type) throws IOException {
        try (FileWriter writer = new FileWriter(fileName + "." + type, true)) {
            writer.write(data + "\n");
        }
    }

    public static List<String> read(String fileName, String type) throws IOException {
        List<String> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName + "." + type))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        }
        return data;
    }

    public static void update(String oldData, String newData, String fileName, String type) throws IOException {
        List<String> fileContent = read(fileName, type);
        try (FileWriter writer = new FileWriter(fileName + "." + type, false)) {
            for (String line : fileContent) {
                if (line.equals(oldData)) {
                    writer.write(newData + "\n");
                } else {
                    writer.write(line + "\n");
                }
            }
        }
    }

    public static void delete(String data, String fileName, String type) throws IOException {
        List<String> fileContent = read(fileName, type);
        try (FileWriter writer = new FileWriter(fileName + "." + type, false)) {
            for (String line : fileContent) {
                if (!line.equals(data)) {
                    writer.write(line + "\n");
                }
            }
        }
    }

    public static List<String> find(String searchData, String fileName, String type) throws IOException {
        List<String> foundData = new ArrayList<>();
        List<String> fileContent = read(fileName, type);
        for (String line : fileContent) {
            if (line.contains(searchData)) {
                foundData.add(line);
            }
        }
        return foundData;
    }
}
