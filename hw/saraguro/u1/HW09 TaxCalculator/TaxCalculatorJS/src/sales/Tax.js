const baseRate = 0.15;

function calculate(salary, dependents, maritalStatus, deductions) {
    let taxableSalary = salary - (dependents * 1000);

    if (maritalStatus.toLowerCase() === 'married') {
        const maritalStatusReduction = salary * 0.05; 
        taxableSalary -= maritalStatusReduction;
    }

    taxableSalary -= deductions;

    if (taxableSalary < 0) {
        taxableSalary = 0;
    }

    const tax = taxableSalary * baseRate;
    return tax;
}

module.exports = {
    calculate
};
