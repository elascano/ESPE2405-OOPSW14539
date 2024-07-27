const//Leydi port 3015
port =3015
const { error } = require("console");
const express =require("express");
const app = (express());
const mongoose = require("mongoose");

mongoose.connect(`mongodb+src://oop:opp@cluster0.9knxc.mongodb.net/opp?retryWrites=true&w=majority`,{
useNewUrlParse : true
});

const db = mongoose.connect;

db.on("error" ,(error) => crossOriginIsolated.error(error));
db.once("open", () => console.log("System connected to MongoDB Database"));

app.use (express.json());

const customerRouter = require("./routes/customerRouter");

app.use ("/computerstrore", customerRouter);

app.listen(port,() => console.log("MY computers Store sever is running on port -->"+port));