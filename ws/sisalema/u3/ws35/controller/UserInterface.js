import express from 'express';
import mongoose from 'mongoose';
import path from 'path';
import { fileURLToPath } from 'url';
import { dirname } from 'path';
import House from './House.js';

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
app.use(express.static(path.join(__dirname, 'view')));

app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'view', 'index.html'));
});

const uri = 'mongodb+srv://yasisalema:yasisalema@cluster0.51fic9g.mongodb.net/Houses';

mongoose.connect(uri)
  .then(() => console.log('Connected to MongoDB database'))
  .catch((error) => {
    console.error('Error connecting to MongoDB:', error);
    console.error('Error details:', error.message);
  });

app.post('/api/houses', async (req, res) => {
  console.log('Request body:', req.body);
  try {
    const house = new House(req.body);
    await house.save();
    res.status(201).json({ message: 'Casa guardada exitosamente' });
  } catch (error) {
    console.error('Error al guardar la casa:', error);
    res.status(400).json({ message: 'Error al guardar la casa', error: error.message });
  }
});

app.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});
