import express from 'express';
import mongoose from 'mongoose';
import path from 'path';
import { fileURLToPath } from 'url';
import { dirname } from 'path';
import Employee from './Employee.js';

const __filename = fileURLToPath(import.meta.url);
const __dirname = dirname(__filename);

const app = express();
const PORT = process.env.PORT || 3000;

app.use(express.json());
app.use((req, res, next) => {
  res.header('Access-Control-Allow-Origin', '*');
  res.header('Access-Control-Allow-Headers', 'Origin, X-Requested-With, Content-Type, Accept');
  next();
});
app.use(express.static(path.join(__dirname, '..', 'public')));

app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, '..', 'public', 'index.html'));
});
const uri = 'mongodb+srv://yasisalema:yasisalema@cluster0.51fic9g.mongodb.net/Proyect';

mongoose.connect(uri)
  .then(() => console.log('Connected to MongoDB database'))
  .catch((error) => {
    console.error('Error connecting to MongoDB:', error);
    console.error('Error details:', error.message);
  });

  app.post('/api/employees', async (req, res) => {
    console.log('Request body:', req.body);  
    try {
      const employee = new Employee(req.body);
      await employee.save();
      res.status(201).json({ message: 'Empleado guardado exitosamente' });
    } catch (error) {
      console.error('Error al guardar el empleado:', error);
      res.status(400).json({ message: 'Error al guardar el empleado', error: error.message });
    }
  });
  

app.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});