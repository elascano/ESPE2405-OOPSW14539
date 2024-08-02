class PaymentCalculator {
  constructor() {
    this.id = document.getElementById('id');
    this.name = document.getElementById('name');
    this.role = document.getElementById('role');
    this.dailyPayment = document.getElementById('dailyPayment');
    this.daysWorked = document.getElementsByName('daysWorked');
    this.totalPayment = document.getElementById('totalPayment');

    const calculateButton = document.querySelector('button[type="button"]');
    calculateButton.addEventListener('click', () => this.calculateTotal());

    const saveButton = document.querySelector('button[type="submit"]');
    saveButton.addEventListener('click', (event) => this.saveData(event));
  }

  calculateTotal() {
    let daysSelected = 0;
    for (let i = 0; i < this.daysWorked.length; i++) {
      if (this.daysWorked[i].checked) {
        daysSelected++;
      }
    }

    if (daysSelected === 0) {
      alert('Please select at least one day worked.');
      return;
    }

    const dailyPaymentValue = parseFloat(this.dailyPayment.value);
    const totalPaymentValue = dailyPaymentValue * daysSelected;
    this.totalPayment.value = totalPaymentValue.toFixed(2);
  }

  // Método para guardar los datos en MongoDB
  async saveData(event) {
    event.preventDefault();

    if (!this.id.value || !this.name.value || !this.role.value) {
      alert('Please fill in all required fields.');
      return;
    }

    let daysSelected = 0;
    for (let i = 0; i < this.daysWorked.length; i++) {
      if (this.daysWorked[i].checked) {
        daysSelected++;
      }
    }

    if (daysSelected === 0) {
      alert('Please select at least one day worked.');
      return;
    }

    const data = {
      id: this.id.value,
      name: this.name.value,
      role: this.role.value,
      dailyPayment: parseFloat(this.dailyPayment.value),
      daysWorked: daysSelected,
      totalPayment: parseFloat(this.totalPayment.value)
    };

    try {
      const response = await fetch('/guardar-datos', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
      });

      if (!response.ok) {
        throw new Error('Error at saving data.');
      }

      alert('Data saved successfully.');

      this.id.value = '';
      this.name.value = '';
      this.role.value = 'select a role'; 
      this.dailyPayment.value = '';
      this.totalPayment.value = '';
      this.daysWorked.forEach(day => day.checked = false);

    } catch (error) {
      console.error('Error:', error);
      alert('Error saving data. Please try again.');
    }
  }
}

document.addEventListener('DOMContentLoaded', () => {
  new PaymentCalculator();
});
