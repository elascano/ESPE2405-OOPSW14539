class EmployeeDetails {
    constructor(name, salary, dependents, maritalStatus, deductions) {
        this.name = name;
        this.salary = salary;
        this.dependents = dependents;
        this.maritalStatus = maritalStatus;
        this.deductions = deductions;
    }

    toString() {
        return `EmployeeDetails{name=${this.name}, salary=${this.salary}, dependents=${this.dependents}, maritalStatus=${this.maritalStatus}, deductions=${this.deductions}}`;
    }
}

module.exports = EmployeeDetails;
