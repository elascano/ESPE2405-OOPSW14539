const//David's port 3016 3001 -30016

port=3000
const express= require("express");
const app = express();
const mongoose = require("mongoose");

mongoose.connect(`mongofb+srv://oop:opp@cluster0.9knxc.mongodb.net/oop?retryWrites=true$w=majority`,{useNewUrlParser:true});

constdb = mongoose.connection;

const db = mongoose.connection;

db.on("error",(error)=>crossOriginIsolated.error(error));
db.once("open",()=>console,log("System connected to MongoDb DataBase"));

app.use(express.json)

const customerRouter = require("./routers/customerRouters");

app.use("/computerstore", customerRouter);

app.listen(port,()=>console/log("My computers Store Server is running on port"+port));