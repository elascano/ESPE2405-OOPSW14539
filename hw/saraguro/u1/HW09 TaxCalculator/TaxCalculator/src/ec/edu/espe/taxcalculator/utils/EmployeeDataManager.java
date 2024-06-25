
package ec.edu.espe.taxcalculator.utils;

import ec.edu.espe.taxcalculator.model.EmployeeDetails;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDataManager {
      private static final String FILE_NAME = "employees.csv";

    static {
        initializeFile();
    }

    private static void initializeFile() {
        File file = new File(FILE_NAME);
        try {
            if (!file.exists()) {
                file.createNewFile(); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveEmployee(EmployeeDetails employee) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) {
            writer.println(employee.getName() + "," +
                           employee.getSalary() + "," +
                           employee.getDependents() + "," +
                           employee.getMaritalStatus() + "," +
                           employee.getDeductions());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void updateEmployees(List<EmployeeDetails> employees) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (EmployeeDetails employee : employees) {
                writer.println(employee.getName() + "," +
                               employee.getSalary() + "," +
                               employee.getDependents() + "," +
                               employee.getMaritalStatus() + "," +
                               employee.getDeductions());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<EmployeeDetails> loadEmployees() {
        List<EmployeeDetails> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 5) {
                    EmployeeDetails employee = new EmployeeDetails(fields[0], 
                                                                   Float.parseFloat(fields[1]),
                                                                   Integer.parseInt(fields[2]),
                                                                   fields[3],
                                                                   Float.parseFloat(fields[4]));
                    employees.add(employee);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
