package ec.edu.espe.motorcycleraura.utils;

import ec.edu.espe.motorcycleraura.model.Motorcycle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Andrea Raura,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class MotorcycleFileManager {
 
    public static ArrayList<Motorcycle> loadMotorcyclesFromFile(String filename) {
        ArrayList<Motorcycle> motorcycles = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            motorcycles = (ArrayList<Motorcycle>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Creating new file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return motorcycles;
    }

    public static void saveMotorcyclesToFile(String filename, ArrayList<Motorcycle> motorcycles) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(motorcycles);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}