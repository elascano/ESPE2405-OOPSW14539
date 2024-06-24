const fs = require('fs');
const path = require('path');

const FILE_NAME = path.join(__dirname, '..', '..', 'employees.csv');

function initializeFile() {
    if (!fs.existsSync(FILE_NAME)) {
        fs.writeFileSync(FILE_NAME, ''); 
    }
}

function saveEmployee(employee) {
    const data = `${employee.name},${employee.salary},${employee.dependents},${employee.maritalStatus},${employee.deductions}\n`;
    fs.appendFileSync(FILE_NAME, data);
}

function updateEmployees(employees) {
    const data = employees.map(employee => `${employee.name},${employee.salary},${employee.dependents},${employee.maritalStatus},${employee.deductions}`).join('\n');
    fs.writeFileSync(FILE_NAME, data);
}

function loadEmployees() {
    const employees = [];
    const fileContent = fs.readFileSync(FILE_NAME, 'utf-8');
    const lines = fileContent.split('\n');
    lines.forEach(line => {
        const fields = line.split(',');
        if (fields.length === 5) {
            const employee = new EmployeeDetails(fields[0], parseFloat(fields[1]), parseInt(fields[2]), fields[3], parseFloat(fields[4]));
            employees.push(employee);
        }
    });
    return employees;
}

initializeFile();

module.exports = {
    saveEmployee,
    updateEmployees,
    loadEmployees
};
