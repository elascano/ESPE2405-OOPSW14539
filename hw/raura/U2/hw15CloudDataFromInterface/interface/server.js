const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const path = require('path');

const app = express();
const PORT = process.env.PORT || 3001; 

app.use(bodyParser.json());

app.use(express.static(path.join(__dirname, '../interface'))); 

// Conexión a MongoDB
mongoose.connect('mongodb+srv://rauraandrea:rauraandrea@cluster0.izygxtz.mongodb.net/oop', {
  useNewUrlParser: true,
  useUnifiedTopology: true
})
.then(() => console.log('MongoDB connected'))
.catch(err => console.error('MongoDB connection error:', err));


const paymentSchema = new mongoose.Schema({
  id: String,
  name: String,
  role: String,
  dailyPayment: Number,
  daysWorked: Number,
  totalPayment: Number
}, {
  collection: 'payments', 
  versionKey: false 
});

const Payment = mongoose.model('Payment', paymentSchema);

app.post('/guardar-datos', async (req, res) => {
  try {
    const newPayment = new Payment(req.body);
    await newPayment.save();
    res.status(201).send('Data saved successfully');
  } catch (err) {
    console.error('Error saving data:', err);
    res.status(500).send('Error saving data');
  }
});

app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, '../interface', 'index.html'));
});

app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
