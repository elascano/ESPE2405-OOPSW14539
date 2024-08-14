// server.js
const express = require('express');
const MongoClient = require('mongodb').MongoClient;
const bodyParser = require('body-parser');
const Keyboard = require('./models/Keyboard');

const app = express();
const port = 3000;

const DATABASE_NAME = 'KeyboardStore';
const COLLECTION_NAME = 'keyboards';
const CONNECTION_URI = 'mongodb+srv://rauraandrea:rauraandrea@cluster0.izygxtz.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0';

let db;

app.use(bodyParser.json());
app.use(express.static('public'));

MongoClient.connect(CONNECTION_URI, { useNewUrlParser: true, useUnifiedTopology: true })
    .then(client => {
        db = client.db(DATABASE_NAME);
        console.log('Connected to Database');
    })
    .catch(error => console.error(error));

app.post('/addKeyboard', (req, res) => {
    const { id, type, amount, price } = req.body;
    const keyboard = new Keyboard(id, type, amount, price);

    db.collection(COLLECTION_NAME).insertOne(keyboard)
        .then(result => res.json({ status: 'Keyboard added', data: result }))
        .catch(error => res.status(500).json({ error: error.message }));
});

app.get('/getKeyboards', (req, res) => {
    db.collection(COLLECTION_NAME).find().toArray()
        .then(results => res.json(results))
        .catch(error => res.status(500).json({ error: error.message }));
});

app.listen(port, () => {
    console.log(`Server running on http://localhost:${port}`);
});
