package ec.edu.espe.saveanobject.menu;

import java.util.Scanner;
import utils.SerializeUtil;

/**
 * Menu class to handle user interaction
 */
public class Menu {
    public static void showMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int operation;

            do {
                System.out.println("Menu:");
                System.out.println("1. Create Computer");
                System.out.println("2. Read Computer");
                System.out.println("3. Exit");

                System.out.print("Enter the option: ");
                operation = scanner.nextInt();
                scanner.nextLine();

                switch (operation) {
                    case 1:
                        SerializeUtil.create(scanner);
                        break;
                    case 2:
                        SerializeUtil.read(scanner);
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

