//Third party imports
const express = require('express');
const dotenv = require('dotenv');
const mongoose = require('mongoose');

dotenv.config({ path: './config.env'});
const app = express();
mongoose.connect(process.env.CONNECTION)
    .then(connection => {
        console.log('connected!')
    })
    .catch(console.log);


//Local import
const shoesRouter = require('./routes/shoeRoute');


app.use(express.json());

//Routes
/*
se produce un error si '/api/v1/users' y 
'/users' en userRoute ya que se considera doble resources,
no obtiene/lee nada.
*/
app.use('/ShoesMarket', shoesRouter);


//add listener.
app.listen(3013, () => {
    console.log('Listen');
});
