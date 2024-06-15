package utils;

import ec.edu.espe.calculateincometax.model.Employee;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kerlly Chiriboga, ODS
 */
public class Manage {
    private static final List<Employee> employees = new ArrayList<>();
    private static final String CSV_FILE = "employees.csv";
    
    public static void createEmployee(Scanner scanner) {       
        System.out.println("Kerlly's Salary Consulting System");
        System.out.println("Enter the Data Employee");
       
        System.out.println("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Name: ");
        String name = scanner.nextLine();
        
        System.out.println("Birth Date: ");
        String birthDate = scanner.nextLine();
        
        System.out.println("Gender: ");
        String gender = scanner.nextLine();
                
        System.out.println("Amount Salary: ");
        float salary = scanner.nextFloat();
        scanner.nextLine();
        
        Employee employee = new Employee(id, name, birthDate, gender, salary);
        employees.add(employee);
        saveEmployeeToCSV(employee);
        System.out.println("Successfully Created Employee!");
    }
    
    public static void readDataEmployee() {
        readEmployeesFromCSV();

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
    
    public static void deleteEmployee(Scanner scanner) {
        System.out.print("Enter ID of the employee to delete: ");
        int idToDelete = scanner.nextInt();
        scanner.nextLine();

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == idToDelete) {
                iterator.remove();
                System.out.println("Employee with ID " + idToDelete + " deleted.");
            }
        }

        saveAllEmployeesToCSV();
    }

    private static void saveEmployeeToCSV(Employee employee) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CSV_FILE, true))) {  
            writer.println(employeeToCSV(employee));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveAllEmployeesToCSV() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CSV_FILE))) {
            for (Employee employee : employees) {
                writer.println(employeeToCSV(employee));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readEmployeesFromCSV() {
        employees.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Employee employee = csvToEmployee(line);
                employees.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String employeeToCSV(Employee employee) {
        return employee.getId() + "," +
               employee.getName() + "," +
               employee.getBirthDate() + "," +
               employee.getGender() + "," +
               employee.getSalary() + "," +
               employee.getIncometax() + "," +
               employee.getSure() + "," +
               employee.getNetSalary();
               
    }

    private static Employee csvToEmployee(String csvLine) {
        String[] parts = csvLine.split(",");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        String birthDate = parts[2];
        String gender = parts[3];
        float salary = Float.parseFloat(parts[4]);
        return new Employee(id, name, birthDate, gender, salary);
    }
}

