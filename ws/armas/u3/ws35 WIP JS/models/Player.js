const mongoose = require('mongoose');

const playerSchema = new mongoose.Schema(
    {
        id: { type: Number },
        name: { type: String },
        age: { type: Number },
        goals: { type: Number },
        matchesPlayed: { type: Number },
        goalsAverage: { type: Number }, 
        offensiveEfficiency: { type: Number } 
    },
    { collection: 'Players' }
);

module.exports = mongoose.model('Player', playerSchema);
