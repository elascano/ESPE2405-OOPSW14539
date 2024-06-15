package ec.edu.espe.farmsimulator.menu;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import static utils.FileManager.*;
import java.io.IOException;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class Menu {
    public static void showMenu() {
        System.out.println("Kerlly's Chicken Farm Simulator");
        try (Scanner scanner = new Scanner(System.in)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            int operation;

            do {
                System.out.println("Menu:");
                System.out.println("1. Create Chicken");
                System.out.println("2. Read Chickens");
                System.out.println("3. Update Chicken");
                System.out.println("4. Delete Chicken");
                System.out.println("5. Find Chicken");
                System.out.println("6. Exit");
                System.out.println("Enter operation: ");

                operation = scanner.nextInt();
                scanner.nextLine();

                try {
                    switch (operation) {
                        case 1:
                            createChicken(scanner, dateFormat);
                            break;
                        case 2:
                            readChickens();
                            break;
                        case 3:
                            updateChicken(scanner, dateFormat);
                            break;
                        case 4:
                            deleteChicken(scanner);
                            break;
                        case 5:
                            findChicken(scanner);
                            break;
                        case 6:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid operation.");
                    }
                } catch (IOException e) {
                    System.err.println("An I/O error occurred: " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("An error occurred: " + e.getMessage());
                }
            } while (operation != 6);
        }
    }
}
