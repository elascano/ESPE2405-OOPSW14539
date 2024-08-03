const express = require("express")
const customer = require("../models/customer").default;
const router = express.Router();

router.get("/customers",async(req,res)=>{
    try{
        const customer = await customer.find();
        res.json(customers);
    }catch(err){
        res.status(5000).json({message:err.message})
    }
    });

module.exports=router;