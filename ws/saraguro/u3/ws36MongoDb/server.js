const express = require('express');
const bodyParser = require('body-parser');
const { MongoClient } = require('mongodb');
const Store = require('./store');

const app = express();
const port = 3000;

const uri = "mongodb+srv://saraguro:saraguro@cluster0.5nyjils.mongodb.net/";
const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true });

let storeCollection;

async function connectDB() {
    try {
        await client.connect();
        const database = client.db("storeDB");
        storeCollection = database.collection("stores");
        console.log('Connected to MongoDB');
    } catch (error) {
        console.error('Error connecting to MongoDB', error);
    }
}

app.use(bodyParser.json());
app.use(express.static('public'));

app.post('/addStore', async (req, res) => {
    const { id, name, location, revenue, numberOfEmployees, storeType } = req.body;
    const newStore = new Store(id, name, location, revenue, numberOfEmployees, storeType);

    if (newStore.isProfitable()) {
        try {
            await storeCollection.insertOne(newStore);
            res.status(200).send('Store added successfully.');
        } catch (error) {
            res.status(500).send('Error adding store.');
        }
    } else {
        res.status(400).send('Store is not profitable enough to be added.');
    }
});

app.get('/stores', async (req, res) => {
    try {
        const stores = await storeCollection.find().toArray();
        res.json(stores);
    } catch (error) {
        res.status(500).send('Error fetching stores.');
    }
});

app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
    connectDB();
});
