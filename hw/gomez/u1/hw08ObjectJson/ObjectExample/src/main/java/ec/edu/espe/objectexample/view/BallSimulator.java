/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.objectexample.view;

import ec.edu.espe.objectexample.model.Ball;
import static ec.edu.espe.objectexample.utils.SaveManager.saveToJsonFile;
import java.util.Scanner;

/**
 *
 * @author Joffre
 */
public class BallSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los datos para crear un objeto Ball
        System.out.println("Ingrese el ID del balón:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.println("Ingrese el tipo de balón:");
        String type = scanner.nextLine();

        System.out.println("Ingrese el color del balón:");
        String color = scanner.nextLine();

        System.out.println("Ingrese el tamaño del balón:");
        String size = scanner.nextLine();

        System.out.println("Ingrese la marca del balón:");
        String tradeMark = scanner.nextLine();

         Ball ball = new Ball(id, type, color, size, tradeMark);

       
        saveBallToJsonFile(ball);

        System.out.println("Objeto Ball guardado en el archivo 'ball.json' correctamente.");
    }

    private static void saveBallToJsonFile(Ball ball) {
       
        String fileName = "ball.json";
        saveToJsonFile(ball, fileName);
    }
}

        
    
    
