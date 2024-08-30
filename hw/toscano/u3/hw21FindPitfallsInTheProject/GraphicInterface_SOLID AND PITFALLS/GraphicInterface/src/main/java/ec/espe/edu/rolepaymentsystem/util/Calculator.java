
package ec.espe.edu.rolepaymentsystem.util;

public class Calculator {

    public static double calculateBonus(double salary, double percentage) {
        try {
            if (salary < 0 || percentage < 0) {
                throw new IllegalArgumentException("Salary and percentage must be non-negative.");
            }
            return salary * (percentage / 100);
        } catch (IllegalArgumentException e) {
            System.err.println("Error calculating bonus: " + e.getMessage());
            return 0; // Safe fallback value
        }
    }

    public static double calculateDeductions(double salary, double taxRate) {
        try {
            if (salary < 0 || taxRate < 0) {
                throw new IllegalArgumentException("Salary and tax rate must be non-negative.");
            }
            return salary * (taxRate / 100);
        } catch (IllegalArgumentException e) {
            System.err.println("Error calculating deductions: " + e.getMessage());
            return 0; // Safe fallback value
        }
    }
}
