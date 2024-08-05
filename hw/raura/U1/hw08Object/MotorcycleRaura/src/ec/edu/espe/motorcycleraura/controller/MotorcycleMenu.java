package ec.edu.espe.motorcycleraura.controller;

import ec.edu.espe.motorcycleraura.model.Motorcycle;
import ec.edu.espe.motorcycleraura.utils.MotorcycleFileManager;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrea Raura, Paradigm Pioneers Squad, DCCO-ESPE
 */
public class MotorcycleMenu {
    private ArrayList<Motorcycle> motorcycles;
    private final String fileName = "motorcycles.dat";
    private Scanner scanner;

    public MotorcycleMenu() {
        motorcycles = MotorcycleFileManager.loadMotorcyclesFromFile(fileName);
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int option;

        do {
            System.out.println("1. Add New Motorcycle");
            System.out.println("2. Delete Motorcycle");
            System.out.println("3. Log Out");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addMotorcycle();
                    break;
                case 2:
                    deleteMotorcycle();
                    break;
                case 3:
                    System.out.println("Logging out...");
                    saveMotorcyclesToFile();
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (option != 3);
    }

    private void addMotorcycle() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Plate: ");
        String plate = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Motorcycle motorcycle = new Motorcycle(id, year, price, brand, plate);
        motorcycles.add(motorcycle);
        System.out.println("Motorcycle successfully registered.");
    }

    private void deleteMotorcycle() {
        System.out.print("Enter the ID of the motorcycle: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Motorcycle motorcycleToRemove = null;
        for (Motorcycle motorcycle : motorcycles) {
            if (motorcycle.getId() == id) {
                motorcycleToRemove = motorcycle;
                break;
            }
        }

        if (motorcycleToRemove != null) {
            motorcycles.remove(motorcycleToRemove);
            System.out.println("Motorcycle successfully deleted.");
        } else {
            System.out.println("Motorcycle not found.");
        }
    }

    private void saveMotorcyclesToFile() {
        MotorcycleFileManager.saveMotorcyclesToFile(fileName, motorcycles);
    }
}