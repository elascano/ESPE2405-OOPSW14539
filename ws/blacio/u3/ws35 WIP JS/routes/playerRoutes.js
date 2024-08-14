const express = require('express');
const Player = require('../models/Player');
const router = express.Router();

// Obtener todos los jugadores
router.get('/players', async (req, res) => {
    try {
        const players = await Player.find();
        res.json(players);
    } catch (err) {
        res.status(500).json({ message: err.message });
    }
});

// Obtener un jugador por ID
router.get('/player/:id', async (req, res) => {
    try {
        const player = await Player.findOne({ id: req.params.id });
        if (player == null) {
            res.status(404).json({ message: 'Player not found' });
        } else {
            res.json(player);
        }
    } catch (error) {
        res.status(500).json({ message: error.message });
    }
});

router.post('/player', async (req, res) => {
    const goals = req.body.goals;
    const matchesPlayed = req.body.matchesPlayed;
    const goalsAverage = matchesPlayed ? (goals / matchesPlayed) : 0;
    const offensiveEfficiency = matchesPlayed ? ((goals / matchesPlayed) * 100) : 0;

    const player = new Player({
        id: req.body.id,
        name: req.body.name,
        age: req.body.age,
        goals: goals,
        matchesPlayed: matchesPlayed,
        goalsAverage: goalsAverage,
        offensiveEfficiency: offensiveEfficiency
    });

    try {
        const newPlayer = await player.save();
        res.status(200).json(newPlayer);
    } catch (error) {
        res.status(500).json({ message: error.message });
    }
});

module.exports = router;
