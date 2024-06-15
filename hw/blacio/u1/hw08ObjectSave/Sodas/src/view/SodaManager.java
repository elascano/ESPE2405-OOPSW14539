package view;

import model.BlacioSoda;
import utils.ByteUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */

public class SodaManager {

    private List<BlacioSoda> sodas;
    private static final String FILENAME = "sodas.dat";

    public SodaManager() {
        sodas = new ArrayList<>();
    }

    public void addSoda(BlacioSoda soda) {
        sodas.add(soda);
        ByteUtil.saveSodasToBytes(sodas, FILENAME); 
        System.out.println("Soda added and saved successfully!");
    }

    public static void main(String[] args) {
        SodaManager manager = new SodaManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a new soda");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter soda id: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter soda flavor: ");
                String flavor = scanner.nextLine();
                System.out.print("Enter soda brand: ");
                String brand = scanner.nextLine();
                System.out.print("Enter soda volume (in liters): ");
                double volume = scanner.nextDouble();
                System.out.print("Enter soda sugar content (in grams per liter): ");
                double sugarContent = scanner.nextDouble();
                scanner.nextLine(); // consume newline

                BlacioSoda soda = new BlacioSoda(id, flavor, brand, volume, sugarContent);
                manager.addSoda(soda);

            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
