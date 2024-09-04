// renderer.js
const mongoose = require('mongoose');
const University = require('./models/university');

document.addEventListener('DOMContentLoaded', () => {
  const form = document.getElementById('university-form');

  form.addEventListener('submit', async (event) => {
    event.preventDefault();
    const id = document.getElementById('university-id').value;
    const name = document.getElementById('university-name').value;
    const fee = parseFloat(document.getElementById('university-fee').value);
    const vat = 0.15;
    const finalFee = fee + (fee * vat);

    const university = new University({
      universityId: id,
      name: name,
      fee: fee,
      finalFee: finalFee
    });

    try {
      await university.save();
      alert('University saved successfully!');
    } catch (error) {
      alert('Error saving university: ' + error.message);
    }
  });

  mongoose.connect('mongodb+srv://ricardoandreslainezsuarez:ricardo_1422@ricardolainez.yyg9cp1.mongodb.net/universityDB', {
    useNewUrlParser: true,
    useUnifiedTopology: true
  }).then(() => {
    console.log('Connected to MongoDB');
  }).catch(err => {
    console.error('Error connecting to MongoDB', err);
  });
});
