import express from 'express';
import mongoose from 'mongoose';
import path from 'path';
import { fileURLToPath } from 'url';
import { dirname } from 'path';
import Friend from './controller/Friends.js';

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

app.use((req, res, next) => {
  if (req.path.endsWith('.js')) {
    res.type('application/javascript');
  }
  next();
});

app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'view', 'index.html'));
});

const uri = 'mongodb+srv://yasisalema:yasisalema@cluster0.51fic9g.mongodb.net/Friends';

mongoose.connect(uri)
  .then(() => console.log('Connected to MongoDB database'))
  .catch((error) => {
    console.error('Error connecting to MongoDB:', error);
    console.error('Error details:', error.message);
  });

app.post('/api/friends', async (req, res) => {
  try {
    const { birthDate } = req.body;
    const birthDateObj = new Date(birthDate);
    const today = new Date();
    let age = today.getFullYear() - birthDateObj.getFullYear();
    const monthDiff = today.getMonth() - birthDateObj.getMonth();
    if (monthDiff < 0 || (monthDiff === 0 && today.getDate() < birthDateObj.getDate())) {
      age--;
    }
    const friendData = {
      ...req.body,
      age // Añade la edad calculada al documento
    };
    const friend = new Friend(friendData);
    await friend.save();
    const savedFriend = await Friend.findById(friend._id).lean();
    console.log('Fecha de nacimiento:', savedFriend.birthDate);
    console.log('Edad calculada y guardada:', savedFriend.age);
    res.status(201).json({ message: 'Amigo guardado exitosamente', friend: savedFriend });
  } catch (error) {
    console.error('Error al guardar el amigo:', error);
    res.status(400).json({ message: 'Error al guardar el amigo', error: error.message });
  }
});

app.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});
