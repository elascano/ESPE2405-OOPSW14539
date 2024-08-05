/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales;
import java.util.Scanner;

/**
 *
 * @author Yostin Sisalema,Code Masters ,DCC0-ESPE
 */
public class IncomeTax {
    private static final double[] TAX_RATES = {0.10, 0.12, 0.15, 0.20, 0.25, 0.30, 0.35, 0.37};
    private static final double[] INCOME_BRACKETS = {
            0, 11000, 28375, 67517, 109225, 173898, 247180, 398350, Double.POSITIVE_INFINITY
    };

    public static double calculateIncomeTax(double salary) {
        double annualSalary=salary*12;
        double taxableIncome = annualSalary - deductions(annualSalary);
        double tax = 0;
        int bracket = 0;

        while (bracket < INCOME_BRACKETS.length && taxableIncome >= INCOME_BRACKETS[bracket]) {
            double taxableAmount = Math.min(taxableIncome - INCOME_BRACKETS[bracket], INCOME_BRACKETS[bracket + 1] - INCOME_BRACKETS[bracket]);
            tax += taxableAmount * TAX_RATES[bracket];
            bracket++;
        }

        return tax;
    }

    public static double deductions(double annualSalary) {
        Scanner scanner = new Scanner(System.in);
        int disability;
        double deductions = 0;
        double[] responsibilitiesFamily = {7, 9, 11, 14, 17, 20, 100};
        int numberFamilyResponsibilities;
        boolean someDisease;

        System.out.print("Enter the number of dependents in the declared period: ");
        numberFamilyResponsibilities = scanner.nextInt();

        System.out.print("Does any family member have a Disability or Catastrophic, rare and/or orphan Diseases? (true/false) ");
        someDisease = scanner.nextBoolean();

        if (numberFamilyResponsibilities <= 5 && !someDisease) {
            deductions += responsibilitiesFamily[numberFamilyResponsibilities];
        } else if (numberFamilyResponsibilities >= 5 && !someDisease) {
            deductions += responsibilitiesFamily[5];
        } else if (numberFamilyResponsibilities >= 0 && someDisease) {
            deductions += responsibilitiesFamily[6];
            System.out.print("Enter the degree of disability (30-49, 50-74, 75-84, 85-100): ");
            disability = scanner.nextInt();

            if (disability >= 30 && disability <= 49) {
                deductions += 14282.40;
            } else if (disability >= 50 && disability <= 74) {
                deductions += 16662.80;
            } else if (disability >= 75 && disability <= 84) {
                deductions += 19043.20;
            } else if (disability >= 85 && disability <= 100) {
                deductions += 23804.00;
            }
        }

        System.out.print("Are you a senior citizen? (true/false) ");
        boolean isOlderAdult = scanner.nextBoolean();
        if (isOlderAdult) {
            deductions += 11902;
        }

        System.out.print("Enter your health expenses for the declared period: ");
        double healthExpenses = scanner.nextDouble();
        deductions += healthExpenses;

        System.out.print("Enter your education expenses for the declared period: ");
        double educationExpenses = scanner.nextDouble();
        deductions += educationExpenses;

        System.out.print("Enter your housing expenses for the declared period: ");
        double housingExpenses = scanner.nextDouble();
        deductions += housingExpenses;

        System.out.print("Enter your retirement plan contributions for the declared period: ");
        double retirementContributions = scanner.nextDouble();
        deductions += retirementContributions;

        final double SOCIAL_SECURITY_RATE = 0.0945;
        deductions += annualSalary * SOCIAL_SECURITY_RATE;

        return deductions;
    }
}
