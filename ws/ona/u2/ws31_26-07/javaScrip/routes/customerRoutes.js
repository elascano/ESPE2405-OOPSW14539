const express = require("express");
const Customer = require("../models/customer");
const customer = require("../model/customer");
const router = express.Router();

//get all customers
router.get("/customers",async(res,res) => {
    try{
        const customers = await customer.find();
        res.json(customers);
    }catch(err){
        res.statusCode(500).json({message:err.message});
    }
});

module.export = router;