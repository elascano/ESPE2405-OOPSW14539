/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.calculateincometax.view;

/**
 *
 * @author Yostin Sisalema,Code Masters ,DCC0-ESPE
 */
import java.util.Scanner;
import ec.edu.espe.calculateincometax.controller.Employee;
import ec.edu.espe.calculateincometax.utils.EmployeeManager;


/**
 *
 * @author Yostin Sisalema,Code Masters ,DCC0-ESPE
 */
public class CalculateIncomeTaxs {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        try (Scanner scanner = new Scanner(System.in)) {
            int operation;
            do {
                System.out.println("Menu:");
                System.out.println("Select an option:");
                System.out.println("1. Add employee");
                System.out.println("2. View employees");
                System.out.println("3. Edit employee");
                System.out.println("4. Delete employee");
                System.out.println("5. Exit");

                System.out.print("Enter the option: ");
                operation = scanner.nextInt();
                scanner.nextLine();

                switch (operation) {
                    case 1:
                        employeeManager.addEmployee();
                        break;
                    case 2:
                        employeeManager.viewEmployees();
                        break;
                    case 3:
                        employeeManager.editEmployee();
                        break;
                    case 4:
                        employeeManager.deleteEmployee();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid operation.");
                }
            } while (operation != 5);
        }
}
}