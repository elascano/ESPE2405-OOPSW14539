const port = 3005;
const express = require('express');
const mongoose = require('mongoose');
const app = express();

mongoose.connect('mongodb+srv://SrJCBM:OOP14539ODS@firstdb.gtv30gi.mongodb.net/playerDB', {
    useNewUrlParser: true,
    useUnifiedTopology: true
});

const db = mongoose.connection;

db.on('error', (error) => console.error(error));
db.once('open', () => console.log('Connected to MongoDB Database'));

app.use(express.json());
app.use(express.static('public')); 

const playerRouter = require('./routes/playerRoutes');

app.use("/players", playerRouter);

app.listen(port, () => {
    console.log("Player Management Server is Running on port --> " + port);
});
