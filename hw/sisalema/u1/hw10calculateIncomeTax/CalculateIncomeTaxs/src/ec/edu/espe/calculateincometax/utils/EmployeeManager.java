/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculateincometax.utils;
import ec.edu.espe.calculateincometax.controller.Employee;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.Gson;

/**
 *
 * @author Yostin Sisalema,Code Masters ,DCC0-ESPE
 */
public class EmployeeManager {
 private static final Gson GSON = new Gson();
 private static final Scanner SCANNER = new Scanner(System.in);
 private final List<Employee> employees = new ArrayList<>();

    public void addEmployee() {
    System.out.print("Enter the name: ");
    String name = SCANNER.nextLine().toLowerCase().trim();
    if (name.isEmpty()) {
        System.out.print("Empty name, please try again.");
        return;
    }

    System.out.print("Enter the last name: ");
    String lastName = SCANNER.nextLine().toLowerCase().trim();
    if (lastName.isEmpty()) {
        System.out.print("Empty last name, please try again.");
        return;
    }

    System.out.print("Enter the ID number: ");
    String idNumber = SCANNER.nextLine().toLowerCase().trim();
    if (idNumber.isEmpty()) {
        System.out.print("Empty ID number, please try again.");
        return;
    }

    System.out.print("Enter the birth date (dd/mm/yyyy): ");
    Date birthDate;
    try {
        birthDate = new Date(SCANNER.nextLine());
    } catch (Exception e) {
        System.out.print("Invalid birth date, please try again.");
        return;
    }

    System.out.print("Enter the gender: ");
    String gender = SCANNER.nextLine().toLowerCase().trim();
    if (gender.isEmpty()) {
        System.out.print("Empty gender, please try again.");
        return;
    }

    System.out.print("Enter the salary: ");
    float salary;
    try {
        salary = SCANNER.nextFloat();
    } catch (InputMismatchException e) {
        System.out.print("Invalid salary, please try again.");
        SCANNER.next(); 
        return;
    }

    Employee employee = new Employee(name, lastName, idNumber, birthDate, gender, salary);
    employees.add(employee);

    System.out.println("Employee added successfully.");
    }
    
    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees registered.");
        } else {
            System.out.println("Employee list:");
            for (int i = 0; i < employees.size(); i++) {
                Employee employee = employees.get(i);
                System.out.println((i + 1) + ". " + employee.toString());
            }
        }
        saveEmployees();
    }

    public void editEmployee() {
        viewEmployees();
        if (!employees.isEmpty()) {
            System.out.print("Enter the number of the employee to edit: ");
            int employeeIndex;
            try {
                employeeIndex = SCANNER.nextInt() - 1;
                SCANNER.nextLine(); // Consume the newline
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a number.");
                SCANNER.next(); // Clear the scanner
                return;
            }

            if (employeeIndex >= 0 && employeeIndex < employees.size()) {
                Employee employee = employees.get(employeeIndex);

                System.out.print("Enter the new name (press Enter to keep the current one): ");
                String newName = SCANNER.nextLine();
                if (!newName.isEmpty()) {
                    employee.setName(newName);
                }

                System.out.print("Enter the new last name (press Enter to keep the current one): ");
                String newLastName = SCANNER.nextLine();
                if (!newLastName.isEmpty()) {
                    employee.setLastName(newLastName);
                }

                System.out.println("Employee edited successfully.");
            } else {
                System.out.println("Invalid employee number.");
            }
        }
        saveEmployees();
    }

    public void deleteEmployee() {
        viewEmployees();
        if (!employees.isEmpty()) {
            System.out.print("Enter the number of the employee to delete: ");
            int employeeIndex;
            try {
                employeeIndex = SCANNER.nextInt() - 1;
                SCANNER.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter a number.");
                SCANNER.next(); // Clear the scanner
                return;
            }

            if (employeeIndex >= 0 && employeeIndex < employees.size()) {
                employees.remove(employeeIndex);
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Invalid employee number.");
            }
        }
        saveEmployees();
    }
    
    private List<Employee> loadEmployees() {
        List<Employee> employees = new ArrayList<>();
        try (FileReader fileReader = new FileReader("employees.json")) {
            JsonArray jsonArray = JsonParser.parseReader(fileReader).getAsJsonArray();
            for (int i = 0; i < jsonArray.size(); i++) {
                Employee employee = GSON.fromJson(jsonArray.get(i), Employee.class);
                employees.add(employee);
            }
        } catch (IOException e) {
            // No se encontró el archivo o hubo un error al leerlo
            System.err.println("Error loading employees: " + e.getMessage());
        }
        return employees;
    }
    
    private void saveEmployees() {
        JsonArray jsonArray = new JsonArray();
        for (Employee employee : employees) {
            jsonArray.add(GSON.toJsonTree(employee));
        }

        try (FileWriter fileWriter = new FileWriter("employees.json")) {
            GSON.toJson(jsonArray, fileWriter);
        } catch (IOException e) {
            // Error al guardar el archivo
        }
    }
    
}