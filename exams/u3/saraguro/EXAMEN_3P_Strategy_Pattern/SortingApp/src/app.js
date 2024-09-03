
const express = require('express');
const mongoose = require('mongoose');
const path = require('path');
const bodyParser = require('body-parser');

const app = express();
const PORT = 3004;

// Conectar a MongoDB
mongoose.connect('mongodb+srv://saraguro:saraguro@cluster0.5nyjils.mongodb.net/strategyLastName', {
    useNewUrlParser: true,
    useUnifiedTopology: true
}).then(() => {
    console.log('Connected to MongoDB');
}).catch(err => {
    console.log('Failed to connect to MongoDB', err);
});

app.use(bodyParser.json());

// Middleware para servir archivos estáticos (como index.html)
app.use(express.static(path.join(__dirname, 'public')));

// Ruta para servir el archivo index.html en la ruta "/"
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'public', 'index.html'));
});

// Importar las clases de ordenación y SortingContext
const BubbleSort = require('./strategies/BubbleSort');
const InsertionSort = require('./strategies/InsertionSort');
const QuickSort = require('./strategies/QuickSort');
const SortingContext = require('./SortingContext');

app.post('/sort', async (req, res) => {
    const array = req.body.elements;
    if (!Array.isArray(array) || array.length === 0) {
        return res.status(400).json({ error: 'Invalid input array.' });
    }

    const size = array.length;
    let sortedArray;
    let algorithm;

    // Crear instancia de SortingContext
    const context = new SortingContext(null);

    // Determinar el algoritmo de ordenación
    if (size >= 2 && size <= 5) {
        context.setSortStrategy(new BubbleSort());
        sortedArray = context.sort([...array]); // Ordena una copia del array
        algorithm = 'BubbleSort';
    } else if (size >= 6 && size <= 10) {
        context.setSortStrategy(new InsertionSort());
        sortedArray = context.sort([...array]); // Ordena una copia del array
        algorithm = 'InsertionSort';
    } else if (size > 10) {
        context.setSortStrategy(new QuickSort());
        sortedArray = context.sort([...array]); // Ordena una copia del array
        algorithm = 'QuickSort';
    } else {
        return res.status(400).json({ error: 'Array must have more than 1 element.' });
    }

    const record = {
        unsorted: array.join(', '),
        size: size,
        algorithm: algorithm,
        sorted: sortedArray.join(', ')
    };

    // Guardar en la base de datos
    try {
        await mongoose.connection.collection('arrayFirstName').insertOne(record);
    } catch (error) {
        console.error('Failed to save to database:', error);
        return res.status(500).json({ error: 'Failed to save to database.' });
    }

    res.json(record);
});

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
