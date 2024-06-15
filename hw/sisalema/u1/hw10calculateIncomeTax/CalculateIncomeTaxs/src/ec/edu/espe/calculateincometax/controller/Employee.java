/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculateincometax.controller;
import sales.IncomeTax;
import java.util.Date;

/**
 *
 * @author Yostin Sisalema,Code Masters ,DCC0-ESPE
 */
public class Employee {
    private String name;
    private String lastName;
    private String idNumber;
    private Date birthDate;
    private String gender;
    private double salary;
    private double incomeTax;
    private double netSalary;

    public Employee(String name, String lastName, String idNumber, Date birthDate, String gender, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthDate = birthDate;
        this.gender = gender;
        this.salary = salary;
        this.incomeTax = IncomeTax.calculateIncomeTax(salary);
        this.netSalary = salary-this.incomeTax;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", lastName=" + lastName + ", idNumber=" + idNumber + ", birthDate=" + birthDate + ", gender=" + gender + ", salary=" + salary + ", incomeTax=" + incomeTax + ", netSalary=" + netSalary + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public void addEmployee(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void removeEmployee(int employeeIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void updateEmployee(int employeeIndex, Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
