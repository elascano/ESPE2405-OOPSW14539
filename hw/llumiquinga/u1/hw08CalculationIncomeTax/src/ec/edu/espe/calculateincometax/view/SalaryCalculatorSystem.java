/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculateincometax.view;

import ec.edu.espe.calculateincometax.model.Employee;

/**
 *
 * @author Jerson Llumiquinga M. - TEAM: JEZHEA S.E.A
 */
public class SalaryCalculatorSystem {
    public static void main(String[] args) {
        Employee employee;
        employee = new Employee(0, "Jerson", "2002/23/12", "Masculino", 2500);
        System.out.println("El Salario del empleado es: " + employee.getNetSalary());
        
    }
}
