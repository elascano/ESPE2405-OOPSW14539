const mongoose = require('mongoose');
const Department = require('./models/department');

document.addEventListener('DOMContentLoaded', () => {
  const form = document.getElementById('department-form');
  const tableBody = document.getElementById('department-table-body');

  form.addEventListener('submit', async (event) => {
    event.preventDefault();
    const id = document.getElementById('department-id').value;
    const name = document.getElementById('department-name').value;
    const rent = parseFloat(document.getElementById('department-rent').value);
    const vat = 0.15;
    const finalRent = rent + (rent * vat);

    const department = new Department({
      departmentId: id,
      name: name,
      rent: rent,
      finalRent: finalRent
    });

    try {
      await department.save();
      alert('Department saved successfully!');
      loadDepartments();
    } catch (error) {
      alert('Error saving department: ' + error.message);
    }
  });

  async function loadDepartments() {
    try {
      const departments = await Department.find();
      tableBody.innerHTML = '';
      departments.forEach(department => {
        const row = document.createElement('tr');
        row.innerHTML = `
          <td>${department.departmentId}</td>
          <td>${department.name}</td>
          <td>${department.rent}</td>
          <td>${department.finalRent}</td>
        `;
        tableBody.appendChild(row);
      });
    } catch (error) {
      alert('Error loading departments: ' + error.message);
    }
  }

  mongoose.connect('mongodb+srv://ricardoandreslainezsuarez:ricardo_1422@ricardolainez.yyg9cp1.mongodb.net/departmentDB', {
    useNewUrlParser: true,
    useUnifiedTopology: true
  }).then(() => {
    console.log('Connected to MongoDB');
    loadDepartments();
  }).catch(err => {
    console.error('Error connecting to MongoDB', err);
  });
});
