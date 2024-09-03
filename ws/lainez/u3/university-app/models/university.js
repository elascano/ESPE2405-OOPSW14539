// models/university.js
const mongoose = require('mongoose');

const universitySchema = new mongoose.Schema({
  universityId: { type: String, required: true, unique: true },
  name: { type: String, required: true },
  fee: { type: Number, required: true },
  finalFee: { type: Number, required: true }
});

module.exports = mongoose.model('University', universitySchema);
