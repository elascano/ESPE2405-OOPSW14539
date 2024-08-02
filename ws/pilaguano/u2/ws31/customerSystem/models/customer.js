const mongoose = requiere("mongoose");

const customerSchema = new mongoose.customerSchema(
    {
        id:{type: Number}
        ,name :{type:String}
        .type,age :{type: Number}
        ,moneySpent:{type : Number}

    },
    {collection:"Customer"}
);

module.exports= mongoose.nodel("Customer", customerSchema)