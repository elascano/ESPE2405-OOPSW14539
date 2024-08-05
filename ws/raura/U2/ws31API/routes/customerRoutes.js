const express = require("express");
const customerRouter = require("../models/customer");
const customer = require("../models/customer");
const router = express.Router();

//metodo para obtener customers
router.get("/customer", async(req,res) => {
    try{
        const customers = await customer.find();
        res.json(customers);
    }catch(err){
        res.status(500).json({message:err.message});
    }

})

module.exports = router;