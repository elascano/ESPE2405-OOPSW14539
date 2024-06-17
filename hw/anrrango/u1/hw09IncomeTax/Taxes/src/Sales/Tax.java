/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sales;

/**
 *
 * @author Mario Anrrango, A-Byte Wizards, DCCO - ESPE
 */
public class Tax {

    public static float computerIva(float ivaPercentage, float amount) {
        float total;
        total = amount + ivaPercentage / 100;
        return total;
    }

    public static float computerIce() {
        //to compute Taxe
        return 0;
    }

    public static double calculateIncomeTax(double income) {
        if ((0 <= income) && (income <= 11902)) {
            return 0;
        } else if ((11902 <= income) && (income < 15159)) {
            return (income - 11902) * 0.05;

        } else if ((15159 <= income) && (income < 19682)) {
            return 163 + (income - 15159) * 0.10;

        } else if ((19682 <= income) && (income < 26031)) {
            return 615 + (income - 19682) * 0.12;
            
        } else if ((26031 <= income) && (income < 34255)) {
            return 1377 + (income - 26031) * 0.15;
            
        } else if ((34255 <= income) && (income  < 45407)) {
            return 2611 + (income - 34255) * 0.20;
            
        } else if ((45407 <= income) && (income < 60450)) {
            return 4841 + (income - 45407) * 0.25;
            
        } else if ((60450 <= income) && (income < 80605)) {
            return 8602 + (income - 60450) * 0.30;
            
        } else if (80605 < income) {
            return 14648 + (income - 80605) * 0.35;
            
        } else {
            return 23956 + (income - 107199) * 0.37;
        }
    }
}
