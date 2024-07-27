const //Gabriel's port 3000 3001 - 3024
 port = 3013;

 const express = require("express");
const app = express();
const mongoose = require("mongoose");


//NO PROBLEM WITH useNewUrlParser, PROBLEM WITH userNewUrlParser, but: [MONGODB DRIVER] Warning: useNewUrlParser is a deprecated option
mongoose.connect(`mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/oop?retryWrites=true&w=majority`, {
    useNewUrlParser: true
});

const db = mongoose.connection;

db.on("error", (error) => crossOriginIsolated.error(error));
db.once("open", () => console.log("System connected to MongoDB Database"));

app.use(express.json());

const customerRouter = require("./routes/customerRoutes");

app.use("/computerstore", customerRouter);

app.listen(port, () => console.log("My Computers Store Server is running on port --> " + port));
