const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');

const app = express();
const port = 3001; // Changed port to 3001 to avoid conflicts

// Mongoose Configuration
mongoose.connect('mongodb+srv://ffalvarado:frank123@databsas.tuxhrit.mongodb.net/Custumer?retryWrites=true&w=majority')
.then(() => console.log('Connected to MongoDB database'))
.catch(err => console.error('Error connecting to MongoDB database', err));

const customerSchema = new mongoose.Schema({
    name: String,
    surname: String,
    email: String,
    phone: String,
    address: String,
}, { collection: 'datacustumer' });

const Customer = mongoose.model('Customer', customerSchema);

// Middleware
app.use(bodyParser.json());
app.use(express.static('public'));

// Routes
app.post('/saveCustomer', async (req, res) => {
    console.log('Received data:', req.body); // Debugging
    const customer = new Customer(req.body);
    try {
        await customer.save();
        res.status(200).json({ message: 'Customer saved successfully' });
    } catch (error) {
        console.error('Error saving customer:', error); // Debugging
        res.status(500).json({ message: 'Error saving customer', error });
    }
});

app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});
