/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.saveanobject.utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import ec.edu.espe.saveanobject.model.Clock;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Yostin Sisalema,Code Master,DCC0-ESPE
 */
public class Serializable {
    public static void createCock(Scanner scanner,List<Clock> clocks){
    System.out.print("Enter the id: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter the clock type (Analog/Digital/Smartwatch/Hybrid): ");
    String clockType = scanner.nextLine();

    System.out.print("Enter the brand (Rolex/Omega/Cartier/IWC/Blancpain): ");
    String brand = scanner.nextLine();

   System.out.print("Enter the model (Seamaster/Santos/Tank): ");
    String model = scanner.nextLine();

    System.out.print("Enter the display type (LCD/AMOLED/E-ink): ");
    String displayType = scanner.nextLine();

    Clock clock = new Clock(id, clockType, brand, model, displayType);
    clocks.add(clock);
    
    }
    public static void saveJson(ArrayList<Clock> clocks) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonObject jsonObject = new JsonObject();
        JsonArray clockJson = new JsonArray();

        for (Clock clock : clocks) {
            clockJson.add(gson.toJsonTree(clock));
        }
        jsonObject.add("Clocks", clockJson);

        try (FileWriter writer = new FileWriter("clocks.json")) {
            gson.toJson(jsonObject, writer);
            System.out.println("Clocks generated and saved in clocks.json");
        } catch (IOException e) {
            System.out.println("Error saving clocks: " + e.getMessage());
        }
    }

    public static void read(Scanner scanner, ArrayList<Clock> clocks) {
        boolean continueInput = true;
        do {
            System.out.println("1. Read individual clock");
            System.out.println("2. Read all clocks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    readIndividualClock(scanner, clocks);
                    break;
                case 2:
                    readGeneralClock(clocks);
                    break;
                case 3:
                    continueInput = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (continueInput);
    }

    public static void readIndividualClock(Scanner scanner, ArrayList<Clock> clocks) {
        System.out.print("Enter clock id to read the object: ");
        String id = scanner.nextLine();

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("clocks"+id+".txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clocks);
            objectOutputStream.close();
            System.out.println("Clocks saved to clocks.txt");
            
            FileInputStream fileInputStream = new FileInputStream(id);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Clock clockObject = (Clock) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println("--> " + clockObject);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading clock object: " + e.getMessage());
        }
    }

    public static void readGeneralClock(ArrayList<Clock> clocks) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("clocks.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clocks);
            objectOutputStream.close();
            System.out.println("Clocks saved to clocks.txt");
            
            FileInputStream fileInputStream = new FileInputStream("clocks.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            clocks = (ArrayList<Clock>) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println("--> \n" + clocks+"\n");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading clock objects: " + e.getMessage());
        }
    }

}
