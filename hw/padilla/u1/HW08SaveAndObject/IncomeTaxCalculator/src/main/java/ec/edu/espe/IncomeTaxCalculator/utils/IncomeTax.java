
package ec.edu.espe.IncomeTaxCalculator.utils;

/**
 *
 * @author Marco Padilla, CodeCrafting Engineers, DCCO-ESPE
 */
public class IncomeTax {

    public static double calculateTax(double annualSalary) {
        double tax = 0;
        
        if (annualSalary <= 11212) {
            tax = 0;
        } else if (annualSalary <= 14285) {
            tax = (annualSalary - 11212) * 0.05;
        } else if (annualSalary <= 17854) {
            tax = (annualSalary - 14285) * 0.1 + 154;
        } else if (annualSalary <= 21442) {
            tax = (annualSalary - 17854) * 0.12 + 511;
        } else if (annualSalary <= 42874) {
            tax = (annualSalary - 21442) * 0.15 + 941;
        } else if (annualSalary <= 64297) {
            tax = (annualSalary - 42874) * 0.2 + 4156;
        } else if (annualSalary <= 85729) {
            tax = (annualSalary - 64297) * 0.25 + 8440;
        } else if (annualSalary <= 114288) {
            tax = (annualSalary - 85729) * 0.3 + 13798;
        } else {
            tax = (annualSalary - 114288) * 0.35 + 22366;
        }

        return tax;
    }
}
