
package ec.edu.espe.IncomeTaxCalculator.view;

import ec.edu.espe.IncomeTaxCalculator.model.Person;
import ec.edu.espe.IncomeTaxCalculator.utils.IncomeTax;
import java.util.Scanner;

/**
 *
 * @author Marco Padilla, CodeCrafting Engineers, DCCO-ESPE
 */
public class IncomeTaxSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter your annual salary: ");
        double annualSalary = scanner.nextDouble();
        
        Person person = new Person(name, annualSalary);
        double tax = IncomeTax.calculateTax(person.getAnnualSalary());
        
        System.out.println("Name: " + person.getName());
        System.out.println("Annual Salary: " + person.getAnnualSalary());
        System.out.println("Income Tax: " + tax);
    }
}
