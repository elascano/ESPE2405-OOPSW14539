/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mru_testcases.controller;
import ec.edu.espe.mru_testcases.utils.UptoMongoDB;
import ec.edu.espe.mru_testcases.model.*;
import java.util.Scanner;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class MRUCalculatortoMongo {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia en metros:");
        double distance = scanner.nextDouble();

        System.out.println("Ingrese el tiempo en segundos:");
        double time = scanner.nextDouble();

        // Calculamos la velocidad usando la fórmula v = d / t
        double velocity = calculateVelocity(distance, time);

        System.out.println("La velocidad es: " + velocity + " m/s");

        // Crear instancias de las clases con los datos ingresados
        Velocity v = new Velocity((float) velocity);
        Time t = new Time((float) time);
        Distance d = new Distance((float) distance);

        
        // Subir los datos a MongoDB usando el método estático
        String uri = "mongodb+srv://JersonLlM:jersonllm23@cluster0.yjwpgvg.mongodb.net/";
        UptoMongoDB.uploadData(uri, "MRU", "data", v, t, d);
    }

    static double calculateVelocity(double distance, double time) {
        if (time == 0) {
            throw new ArithmeticException("El tiempo no puede ser cero.");
        }
        return distance / time;
    }
}