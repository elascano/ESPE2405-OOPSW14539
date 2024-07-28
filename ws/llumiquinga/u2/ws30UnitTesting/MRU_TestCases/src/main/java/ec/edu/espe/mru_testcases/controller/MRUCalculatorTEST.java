/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.mru_testcases.controller;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class MRUCalculatorTEST {
 // Método para calcular la velocidad
    public static double calcularVelocidad(double distancia, double tiempo) {
        if (tiempo == 0) {
            throw new IllegalArgumentException("El tiempo no puede ser cero.");
        }
        return distancia / tiempo;
    }

    public static void main(String[] args) {
        // Ejemplo de uso del método calcularVelocidad
        double distancia = 100; // ejemplo de distancia
        double tiempo = 10; // ejemplo de tiempo
        double velocidad = calcularVelocidad(distancia, tiempo);
        System.out.println("La velocidad es: " + velocidad + " metros por segundo.");
        
    }
}