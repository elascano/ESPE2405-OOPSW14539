const moongoose = require('mongoose');

const customerSchema = new moongoose.Schema(
    {
        id: { type: Number},
        name: { type: String},
        age: { type: Number},
        moneySpent: { type: Number}
    },
    { collection: 'Customers' }
);

module.exports = moongoose.model('Customer', customerSchema);
