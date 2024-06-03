package utilg;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import ec.edu.espe.farmsimulator.model.ChickenFarmer;

public class FileManager {

    private static final String FILE_PATH = "ChickenFarmSimulator.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void createFarmer(ChickenFarmer farmer) throws IOException {
        List<ChickenFarmer> farmers = readAllFarmers();
        if (farmers == null) {
            farmers = new ArrayList<>();
        }
        farmers.add(farmer);
        saveAllFarmers(farmers);
    }

    public static List<ChickenFarmer> readAllFarmers() throws IOException {
        FileReader reader;
        try {
            reader = new FileReader(FILE_PATH);
        } catch (IOException e) {
            return new ArrayList<>();
        }
        Type listType = new TypeToken<ArrayList<ChickenFarmer>>() {}.getType();
        return gson.fromJson(reader, listType);
    }

    public static ChickenFarmer findFarmer(int id) throws IOException {
        List<ChickenFarmer> farmers = readAllFarmers();
        for (ChickenFarmer farmer : farmers) {
            if (farmer.getId() == id) {
                return farmer;
            }
        }
        return null;
    }

    public static void updateFarmer(ChickenFarmer updatedFarmer) throws IOException {
        List<ChickenFarmer> farmers = readAllFarmers();
        for (int i = 0; i < farmers.size(); i++) {
            if (farmers.get(i).getId() == updatedFarmer.getId()) {
                farmers.set(i, updatedFarmer);
                break;
            }
        }
        saveAllFarmers(farmers);
    }

    public static void deleteFarmer(int id) throws IOException {
        List<ChickenFarmer> farmers = readAllFarmers();
        farmers.removeIf(farmer -> farmer.getId() == id);
        saveAllFarmers(farmers);
    }

    private static void saveAllFarmers(List<ChickenFarmer> farmers) throws IOException {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            gson.toJson(farmers, writer);
        }
    }
}
