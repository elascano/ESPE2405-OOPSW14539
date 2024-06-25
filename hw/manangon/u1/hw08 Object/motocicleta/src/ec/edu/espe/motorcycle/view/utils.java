/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.motorcycle.view;

import ec.edu.espe.motorcycle.model.motorcycleInfo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author IAEN
 */
import java.util.ArrayList;
import java.util.Scanner;

public class utils {
    private static ArrayList<motorcycleInfo.Motorcycle> listaDeMotos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        try {
            do {
                System.out.println("1. Ingresar un nuevo motocicleta");
                System.out.println("2. Mostrar todas las motocicletas");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        ingresarMoto(scanner);
                        break;
                    case 2:
                        mostrarMotos();
                        break;
                    case 3:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opcion invalida. Intente nuevamente.");
                }
            } while (opcion != 3);

            scanner.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void ingresarMoto(Scanner scanner) {
        System.out.print("Ingrese la marca de la motocicleta: ");
        String brand = scanner.nextLine();

        System.out.print("Ingrese el modelo de la motocicleta: ");
        String model = scanner.nextLine();

        System.out.print("Ingrese el año de producción de la motocicleta: ");
        int yearOfProduction = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el color de la motocicleta: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese el id de la motocicleta: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        motorcycleInfo.Motorcycle newMotorcycle = new motorcycleInfo.Motorcycle(brand, model, yearOfProduction, color, id);
        listaDeMotos.add(newMotorcycle);
        System.out.println("Motocicleta ingresada exitosamente!");
    }

    public static void mostrarMotos() {
        if (listaDeMotos.isEmpty()) {
            System.out.println("No hay motocicletas para mostrar.");
        } else {
            System.out.println("------ Lista de motocicletas -----");
            for (motorcycleInfo.Motorcycle moto : listaDeMotos) {
                System.out.println(moto);
            }
        }
    }
}
