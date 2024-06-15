/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.incometaxes.utils;

/**
 *
 * @author WINDOWS
 */
public class CalculateIncomeTaxes {
    public static double calculateIncomeTax(double income) {
        double tax = 0;

        if (income <= 11722) {
            tax = 0;
        } else if (income <= 14935) {
            tax = (income - 11722) * 0.05;
        } else if (income <= 18668) {
            tax = 160.60 + (income - 14935) * 0.10;
        } else if (income <= 22418) {
            tax = 678.90 + (income - 18668) * 0.12;
        } else if (income <= 31063) {
            tax = 1226.20 + (income - 22418) * 0.15;
        } else if (income <= 41324) {
            tax = 2828.75 + (income - 31063) * 0.20;
        } else if (income <= 51530) {
            tax = 4829.15 + (income - 41324) * 0.25;
        } else if (income <= 61749) {
            tax = 7329.55 + (income - 51530) * 0.30;
        } else {
            tax = 10313.15 + (income - 61749) * 0.37;
        }

        return tax;
    }
}
