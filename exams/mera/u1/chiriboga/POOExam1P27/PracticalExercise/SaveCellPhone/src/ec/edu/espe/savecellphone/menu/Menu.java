
package ec.edu.espe.savecellphone.menu;

import java.util.Scanner;
import static utils.FileManager.createCellPhone;
import static utils.FileManager.readCellPhone;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class Menu {
        public static void showMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int operation;

            do {
                System.out.println("Menu:");
                System.out.println("1. Create CellPhone");
                System.out.println("2. Read Data CellPhone");
                System.out.println("3. Exit");

                System.out.print("Enter the option: ");
                operation = scanner.nextInt();
                scanner.nextLine();

                switch (operation) {
                    case 1:
                        createCellPhone(scanner);
                        break;
                    case 2:
                        readCellPhone();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid operation.");
                }
            } while (operation != 3);
        }
    }
}
    
