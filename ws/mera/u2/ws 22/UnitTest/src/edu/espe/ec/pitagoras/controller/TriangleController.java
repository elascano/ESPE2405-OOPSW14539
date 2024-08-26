/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.espe.ec.pitagoras.controller;
import java.util.Scanner;

/**
 *
 * @author heiso
 */

public class TriangleController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el lado a: ");
        double a = scanner.nextDouble();
        System.out.print("Introduce el lado b: ");
        double b = scanner.nextDouble();

        // Validar que los lados sean positivos y realizar cálculos
        if (validateSides(a, b)) {
            calculateHypotenuseAndAngles(a, b);
        } else {
            System.out.println("Ambos lados deben ser positivos.");
        }

        scanner.close();
    }

    public static boolean validateSides(double a, double b) {
        return a > 0 && b > 0;
    }
    public static void calculateHypotenuseAndAngles(double a, double b) {
        double hipotenusa = calculateHypotenuse(a, b);

        if (isRightAngle(a, b, hipotenusa)) {
            System.out.println("La hipotenusa es: " + hipotenusa);

            double[] angulos = calculateAngles(a, b);
            System.out.println("Los otros dos ángulos son: " + angulos[0] + " grados y " + angulos[1] + " grados.");
        } else {
            System.out.println("Los lados proporcionados no forman un triángulo rectángulo.");
        }
    }

    public static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    // Método para verificar si el ángulo formado entre los lados a y b es 90 grados
    public static boolean isRightAngle(double a, double b, double c) {
        return Math.abs(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) < 1e-10;
    }

    // Método para calcular los ángulos en un triángulo rectángulo dado a y b
    public static double[] calculateAngles(double a, double b) {
        double anguloA = Math.toDegrees(Math.atan(a / b));
        double anguloB = Math.toDegrees(Math.atan(b / a));
        return new double[] {anguloA, anguloB};
    }
}
