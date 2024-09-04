const Shoe = require('../models/shoe');

const getAllShoes = async (req, res) => {
    try {
        const shoes = await Shoe.find();

        res.status(200).json({
            status: 'success',
            data: {
                shoes: shoes
            }
        });
    } catch (error) {
        res.status(404).json({ message: error.message });
    }
}

const saveShoe = async (req, res) => {
    const body = req.body;
    try {
        const newShoe = await Shoe.create(body);

        //TODO: Send shoeIndex to DB
        res.status(201).json({
            status: 'success',
            data: {
                shoeIndex: newShoe
            }
        });
    } catch (e) {
        res.status(400).json({
            status: 'failed',
            message: e.message
        });
    }


}

const getShoeById = async (req, res) => {
    try {
        const { id } = req.params;
        const shoeIndex = await Shoe.findById({ _id: id });

        if (!shoeIndex) {
            return res.status(404).json({
                status: 'failed',
                message: 'Shoe not found'
            });
        }

        res.status(200).json({
            status: 'success',
            data: {
                shoeIndex: shoeIndex
            }
        });
    } catch (error) {
        res.status(404).json({
            status: 'failed',
            message: error.message
        });
    }
}

const deleteShoe = async (req, res) => {
    try {
        const { id } = req.params;
        const shoes = await Shoe.find();
        const shoeIndex = await Shoe.findByIdAndDelete({ _id: id });

        if (!shoeIndex) {
            return res.status(404).json({
                status: 'failed',
                message: 'Shoe Id not exist'
            });
        }

        res.status(200).json({
            status: 'success',
            data: {
                shoeIndex: shoes
            }
        });
    } catch (error) {
        res.status(404).json({
            status: 'failed',
            message: error.message
        });

    }


}

const updateShoe = async (req, res) => {
    try {
        const { id } = req.params;
        //update shoe
       const shoeUpdated = await Shoe.findByIdAndUpdate(
            { _id: id }, 
            { $set: req.body }
        );

        if (!shoeUpdated) {
            return res.status(404).json({
                status: 'failed',
                message: 'Shoe not found'
            });
        }

        //send response
        res.status(200).json({
            status: 'success',
            data: {
                shoe: shoeUpdated
            }
        });
    } catch (error) {
        res.status(404).json({
            status: 'failed',
            message: error.message
        });
    }


}



module.exports = {
    getAllShoes,
    saveShoe,
    getShoeById,
    deleteShoe,
    updateShoe
}