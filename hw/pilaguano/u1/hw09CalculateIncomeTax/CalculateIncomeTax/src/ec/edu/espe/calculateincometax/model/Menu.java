/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ec.edu.espe.calculateincometax.model;

import java.util.Scanner;


/**
 *
 * @author David Pilaguano, Lenovo , DCCO-ESPE
 */
public class Menu {
    public static void showMenu() {
        try (Scanner scanner = new Scanner(System.in)) {
            int operation;

            do {
                System.out.println("Menu:");
                System.out.println("1. Create Employee");
                System.out.println("2. Read Employee");
                System.out.println("3. Delete Employee");
                System.out.println("4. Exit");

                System.out.print("Enter the option: ");
                operation = scanner.nextInt();
                scanner.nextLine();

                switch (operation) {
                    case 1:
                        createEmployee(scanner);
                        break;
                    case 2:
                        readDataEmployee();
                        break;
                    case 3:
                        deleteEmployee(scanner);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid operation.");
                }
            } while (operation != 4);
        }
    }
}
