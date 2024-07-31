const port = 3019
const express = require("express")//biblioteca
const app = express();//app para inicializar el servidor
const mongoose = require("mongoose")
mongoose.connect('mongodb+srv://oop:opp@cluster0.9knxc.mongodb.net/oop?retryWrites=true&w=majority',{
useNewUrlParser: true
})

const db = mongoose.connection;

db.on("error", (error) => crossOriginIsolated.error(error));
db.once("open", () => console.log("System connected to MongoDb Database"));

app.use(express.json());

const customerRouter = require("./routes/customerRoutes");
app.use("/customers", customerRouter); //esto significa que todas las rutas que comiencen con /customers serán manejadas por el enrutador de clientes
app.listen(port, () => console.log("My Computers Store Server is running on port -->" + port));
