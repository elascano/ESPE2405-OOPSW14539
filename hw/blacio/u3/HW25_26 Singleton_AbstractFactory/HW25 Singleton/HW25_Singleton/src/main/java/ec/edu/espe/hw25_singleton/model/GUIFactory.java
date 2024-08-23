package ec.edu.espe.hw25_singleton.model;

import java.util.Scanner;

/**
 *
 * @author Julio Blacio, Overnight Developers Squad, DCCO-ESPE
 */
public abstract class GUIFactory {

    public static GUIFactory getFactory() {
        int sys = readFromConfigFile();
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new LinuxFactory();
        }
    }

    private static int readFromConfigFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter OS_TYPE (0 for Windows, 1 for Linux): ");
        
        int osType = -1;
        try {
            osType = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter 0 or 1.");
        }

        if (osType != 0 && osType != 1) {
            System.out.println("Invalid OS_TYPE. Please enter 0 for Windows or 1 for Linux.");
            return readFromConfigFile();  // Recursively prompt the user until valid input is received
        }

        return osType;
    }


    public abstract Button createButton();

    public abstract Menu createMenu();
}
