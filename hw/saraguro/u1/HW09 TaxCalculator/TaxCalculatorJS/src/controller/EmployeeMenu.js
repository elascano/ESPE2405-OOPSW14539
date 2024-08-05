const EmployeeDetails = require('../model/EmployeeDetails');
const EmployeeDataManager = require('../utils/EmployeeDataManager');
const Tax = require('../sales/Tax');
const readline = require('readline');

class EmployeeMenu {
    constructor() {
        this.employees = EmployeeDataManager.loadEmployees();
        this.rl = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });
    }

    addEmployee() {
        this.rl.question('Name: ', name => {
            this.rl.question('Salary: ', salary => {
                salary = parseFloat(salary);
                this.rl.question('Number of dependents: ', dependents => {
                    dependents = parseInt(dependents);
                    this.rl.question('Marital status (single/married): ', maritalStatus => {
                        this.rl.question('Additional deductions: ', deductions => {
                            deductions = parseFloat(deductions);
                            const employee = new EmployeeDetails(name, salary, dependents, maritalStatus, deductions);
                            this.employees.push(employee);
                            EmployeeDataManager.saveEmployee(employee);
                            console.log('Employee added successfully.');
                            this.rl.close();
                        });
                    });
                });
            });
        });
    }

    listEmployees() {
        this.employees.forEach(employee => {
            console.log(employee.toString());
        });
    }

    deleteEmployee() {
        this.rl.question('Enter the name of the employee to delete: ', name => {
            this.employees = this.employees.filter(employee => employee.name !== name);
            EmployeeDataManager.updateEmployees(this.employees);
            console.log('Employee deleted successfully.');
            this.rl.close();
        });
    }

    calculateTax() {
        this.rl.question('Enter the name of the employee to calculate tax: ', name => {
            const employee = this.employees.find(emp => emp.name.toLowerCase() === name.toLowerCase());
            if (employee) {
                const tax = Tax.calculate(employee.salary, employee.dependents, employee.maritalStatus, employee.deductions);
                console.log(`Tax for ${employee.name} is: ${tax}`);
            } else {
                console.log('Employee not found.');
            }
            this.rl.close();
        });
    }

    showMenu() {
        this.rl.question('\nEmployee Menu\n1. Add Employee\n2. List Employees\n3. Delete Employee\n4. Calculate Tax\n5. Exit\nSelect an option: ', option => {
            switch (parseInt(option)) {
                case 1:
                    this.addEmployee();
                    break;
                case 2:
                    this.listEmployees();
                    break;
                case 3:
                    this.deleteEmployee();
                    break;
                case 4:
                    this.calculateTax();
                    break;
                case 5:
                    console.log('Exiting...');
                    this.rl.close();
                    return;
                default:
                    console.log('Invalid option.');
            }
        });
    }
}

module.exports = EmployeeMenu;
