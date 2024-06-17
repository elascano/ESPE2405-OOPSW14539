/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Sjean
 */

import java.util.Scanner;
public class IncomeTaxesSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese su salario anual (USD): ");
        double income = scanner.nextDouble();

        double tax = calculateIncomeTax(income);

        System.out.printf("el impuesto anual de su sueldo "+income+" es --> "+tax+" dólares\n");
    }
}
