const express = require('express');
const router = express.Router();
const {
    getAllShoes,
    saveShoe,
    getShoeById, 
    deleteShoe,
    updateShoe
} = require('../controllers/shoeController');

router.get('/shoes', getAllShoes);

router.get('/getShoe/:id', getShoeById);

router.post('/saveShoe', saveShoe);

router.delete('/deleteShoe/:id', deleteShoe);

router.patch('/updateShoe/:id', updateShoe);

module.exports = router;