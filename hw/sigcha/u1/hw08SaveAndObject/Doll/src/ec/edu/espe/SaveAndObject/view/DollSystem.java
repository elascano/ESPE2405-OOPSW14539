package ec.edu.espe.SaveAndObject.view;

import ec.edu.espe.SaveAndObject.model.Doll;
import static ec.edu.espe.SaveAndObject.utils.FileManager.saveObject;
import java.util.Scanner;

/**
 *
 * @author [Tu Nombre]
 */
public class DollSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Doll ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.println("Enter Doll Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Doll Material: ");
        String material = scanner.nextLine();

        System.out.println("Enter Doll Price: ");
        double price = scanner.nextDouble();

        System.out.println("Is the Doll Collectible? (true/false): ");
        boolean isCollectible = scanner.nextBoolean();

        Doll doll = new Doll(id, name, material, price, isCollectible);
        System.out.println("Doll Data --> " + doll);

        saveObject(doll);
    }
}
