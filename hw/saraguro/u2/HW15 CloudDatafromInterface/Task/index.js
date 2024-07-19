// index.js

const express = require('express');
const mongoose = require('mongoose');
const bodyParser = require('body-parser');
const Task = require('./models/Task'); // Importa el modelo Task aquí

const app = express();
const port = process.env.PORT || 3000;

// Configurar body-parser para leer datos del formulario
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static('public')); // Servir archivos estáticos desde public/

// Conectar a MongoDB
const mongoURI = 'mongodb+srv://saraguro:saraguro@cluster0.5nyjils.mongodb.net/';
mongoose.connect(mongoURI, { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => console.log('MongoDB Connected'))
    .catch(err => console.log(err));

// Definir la ruta principal para servir el formulario HTML
app.get('/', (req, res) => {
    res.sendFile(__dirname + '/views/index.html');
});

// Manejar envío de datos del formulario para crear una nueva tarea
app.post('/task', (req, res) => {
    const { taskName, startDate, duration, teacherName, shift, subject } = req.body;

    // Convertir startDate en un objeto Date válido
    const startDateObj = new Date(startDate);

    // Calcular la fecha de finalización
    const endDate = new Date(startDateObj);
    endDate.setDate(startDateObj.getDate() + parseInt(duration));

    // Crear una nueva tarea usando el modelo Mongoose
    const newTask = new Task({
        taskName,
        startDate: startDateObj,
        duration,
        teacherName,
        shift,
        endDate,
        subject
    });

    // Guardar la tarea en MongoDB
    newTask.save()
        .then(() => {
            console.log('Task saved successfully');
            res.redirect('/'); // Redirigir a la página principal después de guardar
        })
        .catch(err => console.log(err));
});

// Iniciar el servidor
app.listen(port, () => {
    console.log(`Server running on http://localhost:${port}`);
});
