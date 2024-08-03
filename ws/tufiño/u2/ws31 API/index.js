const port = 3005;
const express = require('express');
const { default: mongoose } = require('mongoose');
const app = express();
const moongoose = require('mongoose');

mongoose.connect('mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/oop?retryWrites=true&w=majority', {
useNewUrlParser: true});

const db = mongoose.connection;

db.on('error', (error) => crossOriginIsolated.error(error));
db.once('open', () => console.log('Connected to MongoDb Database'));

app.use(express.json());

const customerRouter = require('./routes/customerRoutes');

app.use("/computerstore", customerRouter);

app.listen(port, () => {console.log ("My Computers Store Server is Running on port --> " + port)});