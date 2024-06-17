/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.car.view;

import ec.edu.espe.car.model.Car;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CODE_CRAFTING_ENGINEERS
 */
public class ejecucion {

     private static ArrayList<Car> listaDeCaros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        try{
        do {
            System.out.println("1. Ingresar un nuevo carro");
            System.out.println("2. Mostrar todos los carros");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    ingresarCaro(scanner);
                    break;
                case 2:
                    mostrarCaros();
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
        }catch (Exception ex){
            System.out.println("Error"+ex.getMessage());
        }
    }

    public static void ingresarCaro(Scanner scanner) {
        System.out.print("Ingrese el id del carro: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Ingrese el modelo del carro: ");
        String model = scanner.nextLine();
        
        System.out.print("Ingrese la placa del carro: ");
        String plate = scanner.nextLine();       
        
        System.out.print("Ingrese el color del carro: ");
        String color = scanner.nextLine();
        
        System.out.print("Ingrese el precio del carro: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        Car nuevoCaro = new Car(id, model, plate, color, price);
        listaDeCaros.add(nuevoCaro);
        System.out.println("Carro ingresado exitosamente!");
    }

    public static void mostrarCaros() {
        if (listaDeCaros.isEmpty()) {
            System.out.println("No hay carros para mostrar.");
        } else {
            System.out.println("Lista de carros:");
            for (Car caro : listaDeCaros) {
                System.out.println(caro);
            }
        }
    }
    
}
