
package ec.edu.espe.taxcalculator.controller;


import ec.edu.espe.taxcalculator.model.EmployeeDetails;
import ec.edu.espe.taxcalculator.utils.EmployeeDataManager;
import sales.Tax;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class EmployeeMenu {
    private List<EmployeeDetails> employees;

    public EmployeeMenu() {
        employees = EmployeeDataManager.loadEmployees();
    }

    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Salary: ");
        float salary = scanner.nextFloat();
        System.out.print("Number of dependents: ");
        int dependents = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        System.out.print("Marital status (single/married): ");
        String maritalStatus = scanner.nextLine();
        System.out.print("Additional deductions: ");
        float deductions = scanner.nextFloat();

        EmployeeDetails employee = new EmployeeDetails(name, salary, dependents, maritalStatus, deductions);
        employees.add(employee);
        EmployeeDataManager.saveEmployee(employee);
        System.out.println("Employee added successfully.");
    }

    public void listEmployees() {
        for (EmployeeDetails employee : employees) {
            System.out.println(employee);
        }
    }

    public void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the employee to delete: ");
        String name = scanner.nextLine();
        employees.removeIf(employee -> employee.getName().equals(name));
        EmployeeDataManager.updateEmployees(employees);
        System.out.println("Employee deleted successfully.");
    }

    public void calculateTax() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the employee to calculate tax: ");
        String name = scanner.nextLine();
        for (EmployeeDetails employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                float tax = Tax.calculate(employee.getSalary(), employee.getDependents(), employee.getMaritalStatus(), employee.getDeductions());
                System.out.println("Tax for " + employee.getName() + " is: " + tax);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\nEmployee Menu");
            System.out.println("1. Add Employee");
            System.out.println("2. List Employees");
            System.out.println("3. Delete Employee");
            System.out.println("4. Calculate Tax");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (option) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    listEmployees();
                    break;
                case 3:
                    deleteEmployee();
                    break;
                case 4:
                    calculateTax();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 5);
        scanner.close();
    }
 
}
