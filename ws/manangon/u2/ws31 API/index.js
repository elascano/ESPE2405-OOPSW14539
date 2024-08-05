const port = 3011;
const express = require("express")
const { default: mongoose } = require('mongoose');
const app = express ();
const moongoose = require ("mongoose");
mongoose.connect("mongodb+srv://opp:opp@cluster0.9knxc.mongodb.net/opp?retryWrites=true&w=majority",{
useNewUrlParser :true });

const db = mongoose.connection

db.on("error",(error)=> crossOriginIsolated.error(error));
db.once("open",()=>console.log("System connected to MongoDb Database"));

app.use(express.json());

const customerRouter = require("./routes/customerRoutes");
app.use("/computerstore",customerRouter);
app.listen(port,()=>console.log("My Computers Store Server is running in port --> "+port));

