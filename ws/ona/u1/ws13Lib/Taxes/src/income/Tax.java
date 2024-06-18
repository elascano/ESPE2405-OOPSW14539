/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package income;

/**
 *
 * @author CODE_CRAFTING_ENGINEERS
 */
public class Tax {
    public static float incomeTax(float amount ) {
       float annualIncome = amount * 12;
       float totalTax;
       if (annualIncome <= 11902) {
            totalTax = 0;
        } else if (annualIncome <= 15159) {
            totalTax = (annualIncome - 11902) * 0.05f;
        } else if (annualIncome <= 19682) {
            totalTax = (annualIncome - 15159) * 0.10f + (15159 - 11902) * 0.05f;
        } else if (annualIncome <= 26031) {
            totalTax = (annualIncome - 19682) * 0.12f + (19682 - 15159) * 0.10f + (15159 - 11902) * 0.05f;
        } else if (annualIncome <= 34255) {
            totalTax = (annualIncome - 26031) * 0.15f + (26031 - 19682) * 0.12f + (19682 - 15159) * 0.10f + (15159 - 11902) * 0.05f;
        } else if (annualIncome <= 45407) {
            totalTax = (annualIncome - 34255) * 0.20f + (34255 - 26031) * 0.15f + (26031 - 19682) * 0.12f + (19682 - 15159) * 0.10f + (15159 - 11902) * 0.05f;
        } else if (annualIncome <= 60450) {
            totalTax = (annualIncome - 45407) * 0.25f + (45407 - 34255) * 0.20f + (34255 - 26031) * 0.15f + (26031 - 19682) * 0.12f + (19682 - 15159) * 0.10f + (15159 - 11902) * 0.05f;
        } else if (annualIncome <= 80605) {
            totalTax = (annualIncome - 60450) * 0.30f + (60450 - 45407) * 0.25f + (45407 - 34255) * 0.20f + (34255 - 26031) * 0.15f + (26031 - 19682) * 0.12f + (19682 - 15159) * 0.10f + (15159 - 11902) * 0.05f;
        } else {
            totalTax = (annualIncome - 80605) * 0.37f + (80605 - 60450) * 0.30f + (60450 - 45407) * 0.25f + (45407 - 34255) * 0.20f + (34255 - 26031) * 0.15f + (26031 - 19682) * 0.12f + (19682 - 15159) * 0.10f + (15159 - 11902) * 0.05f;
        }
        return totalTax;
    }
}
