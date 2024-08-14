const express = require("express");
const mongoose = require("mongoose");

const app = express();
const port = 3007;
mongoose.connect('mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/oop?retryWrites=true&w=majority', { useNewUrlParser: true, useUnifiedTopology: true });

const db = mongoose.connection;

db.on("error", (error) => console.error(error));
db.once("open", () => console.log("System connected to MongoDB database"));
app.use(express.json());

const customerRouter = require("./routes/customerRoutes");

app.use("/computerstore", customerRouter);

app.listen(port, () => console.log("My Computer Store Server is running on port --> " + port)); 


