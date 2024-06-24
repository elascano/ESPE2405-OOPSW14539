/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.kitchenlainez.view;

import ec.edu.espe.kitchenlainez.model.Kitchen;
import static ec.edu.espe.kitchenlainez.utils.FileManager.saveObject;
import java.util.Scanner;

/**
 *
 * @author WINDOWS
 */
public class KitchenSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter kitchen id: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter numbers of sprockets: ");
                int numberOfSprockets = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter kitchen brand: ");
                String brand = scanner.nextLine();
                System.out.print("Enter kitchen size: ");
                String size = scanner.nextLine();
                System.out.print("Enter kitchen color: ");
                String color = scanner.nextLine();

                Kitchen kitchen = new Kitchen(id, numberOfSprockets, brand, size, color);
                saveObject(kitchen);
    }
}
