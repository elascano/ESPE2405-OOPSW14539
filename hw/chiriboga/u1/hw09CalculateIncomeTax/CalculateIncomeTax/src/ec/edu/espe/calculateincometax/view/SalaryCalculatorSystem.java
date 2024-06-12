
package ec.edu.espe.calculateincometax.view;

import ec.edu.espe.calculateincometax.model.Employee;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class SalaryCalculatorSystem {
    public static void main(String[] args) {
        Employee employee;
        employee = new Employee(0, "Kerlly", "2004/01/13", "Femenino", 1000);
        System.out.println("Your salary is:  " + employee.getNetSalary());
        
    }
}
