const mongoose = require('mongoose');

const shoeSchema = new mongoose.Schema({
    name: String,
    price: Number,
    discount: Number
});

const Shoe = mongoose.model('Shoe', shoeSchema);

module.exports = Shoe;
