/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.rolepaymentsystem.view;

import ec.edu.espe.rolepaymentsystem.controller.EmployeeManager;
import ec.edu.espe.rolepaymentsystem.controller.PayrollGenerator;
import ec.edu.espe.rolepaymentsystem.model.Employee;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Code Masters
 */
public class UserInterface {
    private static final Scanner SCANNER = new Scanner(System.in);
    private final EmployeeManager employeeManager;
    private final PayrollGenerator payrollGenerator;
    private static final double BASIC_SALARY = 460.0; 

    
    public UserInterface(EmployeeManager employeeManager, PayrollGenerator payrollGenerator) {
        this.employeeManager = employeeManager;
        this.payrollGenerator = payrollGenerator;
    }

    public void showMainMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Ver empleados");
            System.out.println("3. Editar empleado");
            System.out.println("4. Eliminar empleado");
            System.out.println("5. Generar roles de pago");
            System.out.println("6. Salir");
            int option = SCANNER.nextInt();
            SCANNER.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    editEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    payrollGenerator.generatePayrolls(employeeManager.getEmployees());
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private void addEmployee() {
        try {
           System.out.print("Ingrese el nombre: ");
            String name = getUserInput("Nombre vacio");

            System.out.print("Ingrese el apellido: ");
            String lastName = getUserInput("Apellido vacio");

            System.out.print("Ingrese el numero de identificacion: ");
            String idNumber = getUserInput("Número de identificación vacio");

            System.out.print("Ingrese la fecha de contratacion (dd/MM/yyyy): ");
            String dateStr = SCANNER.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date hireDate = sdf.parse(dateStr);

            System.out.print("Ingrese las horas extras: ");
            double overtimeHours=getDoubleInput("Horas extras vacias");

            System.out.print("Ingrese los dias ausentes: ");
            double absentDays=getDoubleInput("Dias ausentes vacias");


            System.out.print("Ingrese las bonificaciones: ");
            double bonuses=getDoubleInput("Bonificaciones vacias");

            System.out.print("Ingrese los prestamos del IESS: ");
            double iessLoans =getDoubleInput("Prestamos al IESS vacias");

            System.out.print("Ingrese los préstamos de la empresa: ");
            double companyLoans=getDoubleInput("Prestamo de la empresa vacias");

            System.out.print("Ingrese las multas: ");
            double fines=getDoubleInput("Dias ausentes vacias");

            System.out.print("¿El empleado trae su propia comida? (true/false): ");
            boolean bringOwnFood = getBooleanInput("Entrada inválida");

            Employee employee = new Employee(name, lastName, idNumber, hireDate, BASIC_SALARY, overtimeHours, absentDays, bonuses, iessLoans, companyLoans, fines, bringOwnFood);

            employeeManager.addEmployee(employee);

            System.out.println("Empleado agregado correctamente.");
        } catch (ParseException e) {
            System.out.println("Error en el formato de la fecha. Por favor, ingresela en el formato dd/MM/yyyy.");
        } catch (Exception e) {
            System.out.println("Error al ingresar los datos. Intentelo nuevamente.");
        }
    }

    private void viewEmployees() {
        List<Employee> employees = employeeManager.getEmployees();
        if (employees.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (int i = 0; i < employees.size(); i++) {
                Employee employee = employees.get(i);
                System.out.println((i + 1) + ". " + employee.getName() + " " + employee.getLastName());
            }
        }
    }

    private void editEmployee() {
       viewEmployees();
        if (!employeeManager.getEmployees().isEmpty()) {
            System.out.print("Ingrese el número del empleado a editar: ");
            int employeeIndex = SCANNER.nextInt() - 1;
            SCANNER.nextLine(); 

            if (employeeIndex >= 0 && employeeIndex < employeeManager.getEmployees().size()) {
                Employee employee = employeeManager.getEmployees().get(employeeIndex);
                System.out.print("Ingrese el nuevo nombre (presione Enter para mantener el actual): ");
                String newName = SCANNER.nextLine();
                if (!newName.isEmpty()) {
                    employee.setName(newName);
                }

                System.out.print("Ingrese el nuevo apellido (presione Enter para mantener el actual): ");
                String newLastName = SCANNER.nextLine();
                if (!newLastName.isEmpty()) {
                    employee.setLastName(newLastName);
                }

                // Continúa solicitando y actualizando los demás campos del empleado

                employeeManager.updateEmployee(employeeIndex, employee);
                System.out.println("Empleado editado correctamente.");
            } else {
                System.out.println("Número de empleado inválido.");
            }
        }
    }

    private void deleteEmployee() {
        viewEmployees();
        if (!employeeManager.getEmployees().isEmpty()) {
            System.out.print("Ingrese el número del empleado a eliminar: ");
            int employeeIndex = SCANNER.nextInt() - 1;
            SCANNER.nextLine(); // Consumir el salto de línea

            if (employeeIndex >= 0 && employeeIndex < employeeManager.getEmployees().size()) {
                employeeManager.removeEmployee(employeeIndex);
                System.out.println("Empleado eliminado correctamente.");
            } else {
                System.out.println("Número de empleado inválido.");
            }
        }
    }
    private static String getUserInput(String errorMessage) {
    try {
        return SCANNER.nextLine().toLowerCase().trim();
    } catch (Exception e){
        System.out.print(errorMessage);
        return "";
    }
}
    private static double getDoubleInput(String errorMessage) {
        try {
            double value = SCANNER.nextDouble();
            SCANNER.nextLine(); 
            return value;
        } catch (InputMismatchException e) {
            System.out.print(errorMessage);
            SCANNER.nextLine(); 
            return 0.0;
        }
    }

    private static boolean getBooleanInput(String errorMessage) {
        try {
            boolean value = SCANNER.nextBoolean();
            SCANNER.nextLine(); 
            return value;
        } catch (InputMismatchException e) {
            System.out.print(errorMessage);
            SCANNER.nextLine();
            return false;
        }
    }
}
