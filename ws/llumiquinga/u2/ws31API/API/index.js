const port = 3010;
const express = require('express');
const mongoose = require('mongoose');
const app = express();

mongoose.connect('mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/oop?retryWrites=true&w=majority', {
  useNewUrlParser: true,
  useUnifiedTopology: true
});

const db = mongoose.connection;

db.on('error', (error) => console.error('Connection error:', error));
db.once('open', () => console.log('Connected to MongoDB Database'));

app.use(express.json());

const customerRouter = require('./routes/customerRoutes');

app.use("/computerstore", customerRouter);

app.listen(port, () => {
  console.log("My Computers Store Server is running on port --> " + port);
});
