document.addEventListener('DOMContentLoaded', () => {
  const form = document.getElementById('employeeForm');
  const saveButton = document.getElementById('saveButton');
  const cancelButton = document.getElementById('cancelButton');

  saveButton.addEventListener('click', () => {
    const employeeData = {
      name: document.getElementById('name').value,
      lastName: document.getElementById('lastName').value,
      idNumber: document.getElementById('idNumber').value,
      hireDate: new Date(
        document.getElementById('hireYear').value,
        document.getElementById('hireMonth').selectedIndex,
        document.getElementById('hireDay').value
      ),
      basicSalary: parseFloat(document.getElementById('basicSalary').value),
      overtimeHours: parseInt(document.getElementById('overtimeHours').value, 10),
      bonuses: parseInt(document.getElementById('bonuses').value, 10),
      iessLoans: parseInt(document.getElementById('iessLoans').value, 10),
      companyLoans: parseInt(document.getElementById('companyLoans').value, 10),
      absentDays: parseInt(document.getElementById('absentDays').value, 10),
      fines: parseInt(document.getElementById('fines').value, 10),
      bringOwnFood: document.getElementById('bringOwnFood').value === 'si'
    };

    console.log('Employee Data:', employeeData);

    fetch('/api/employees', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(employeeData)
    })
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error('Error:', error));
  });

  cancelButton.addEventListener('click', () => {
    form.reset();
  });
});
